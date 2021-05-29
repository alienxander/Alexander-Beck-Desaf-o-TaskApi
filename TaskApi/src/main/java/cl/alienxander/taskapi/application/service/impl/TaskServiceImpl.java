package cl.alienxander.taskapi.application.service.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import cl.alienxander.taskapi.application.data.ms.TaskMs;
import cl.alienxander.taskapi.application.exception.DataMsException;
import cl.alienxander.taskapi.application.exception.ServiceException;
import cl.alienxander.taskapi.application.service.ServiceImpl;
import cl.alienxander.taskapi.application.service.TaskService;
import cl.alienxander.taskapi.domain.generic.responses.ResponseObject;
import cl.alienxander.taskapi.domain.model.WorkingDay;
import cl.alienxander.taskapi.infrastructure.rest.controllers.TaskController;
import cl.alienxander.taskapi.domain.model.Task;
import cl.alienxander.taskapi.domain.model.TasksPerWorkingDay;
/**
 * 
 * @author Alexander Beck
 * @version 1.0
 * <p>Clase responsable de recibir los datos y realizar cálculos, transformaciones u otras operaciones para así devolverlos
 * a las capas superiores.</p>
 */
@Service("taskService")
public class TaskServiceImpl extends ServiceImpl implements TaskService{
	private static final Logger logger = LoggerFactory.getLogger(TaskServiceImpl.class);
	@Value("${application.service.maxTimeWorkingDay}")
	private int maxTimeWorkingDay;
	@Autowired
	private TaskMs taskMs;
	@Autowired
	ResponseObject response;
	/**
	 * <p>Método que obtiene los task desde la capa MS y los ordena por jornadas o días laborales</p>
	 * @return ResponseObject
	 * @since 1.0
	 */
	@Override
	public ResponseObject getTasksPerWorkingDay() {
		// TODO Auto-generated method stub
		logger.info("Se inicia la llamada a tasks microservice");
		List<Task> tasks = null;
		try {
			tasks = taskMs.getTasks();
			logger.info("Fin a la llamada a tasks microservice");
			Collections.sort(tasks);

			response.setBody(groupTaskPerWorkingDay(tasks));
			response.setResponseMessage(getServiceMessageOk());
			
		} catch (DataMsException e) {
			// TODO Auto-generated catch block
			response.setBody(null);
			response.setResponseMessage(getServiceMessageError());
		}
		return response;
	}
	/**
	 * 
	 * @param Lista de objectos Tasks o tareas
	 * @return TasksPerWorkingDay
	 * {@summary} Metodo que se encarga de agrupar las tareas obtenidas del microservicio taks
	 */
	private TasksPerWorkingDay groupTaskPerWorkingDay(List<Task> tasks) {
		logger.info("Se inicia la afrupacion de tasks (tareas)");
		
		TasksPerWorkingDay tasksPerWorkingDay = new TasksPerWorkingDay();
		tasksPerWorkingDay.setHrs_jornada(maxTimeWorkingDay);
		List<WorkingDay> jornadas = new ArrayList<WorkingDay>();
		int idJornada = 0;
		int c = 0;
		/*
		 * Se recorren las tareas ya ordenadas de mayor a menor por duracion de cada tarea,
		 * a medida de que se agregan o agrupan tareas se incrementa c para no volver a evaluarlas
		 */
		for(int i = c;i<=tasks.size() - 1;i++){
			WorkingDay jornada = new WorkingDay();
			List<String> tareas = new ArrayList<String>();
			int sumaJornadas = 0;
			for(int j=c;j<=tasks.size() - 1;j++) {
				sumaJornadas = tasks.get(j).getDuration() + sumaJornadas; 
				//Se agrega una tarea al grupo mientras no se sobrepase el maximo permitido para un dia
				if(sumaJornadas <= maxTimeWorkingDay) {
					tareas.add(tasks.get(j).getTask_id());
					c++;
				}else {
					break;
				}
				
				jornada.setTimeToDone(sumaJornadas);
			}
			if(sumaJornadas == 0) {
				break;
			}
			idJornada++;
			jornada.setId(idJornada);
			jornada.setTaskList(tareas);
			
			jornadas.add(jornada);
			tasksPerWorkingDay.setJornadas(jornadas);
		}
		tasksPerWorkingDay.setDias_termino(idJornada);
		logger.info("Fin de la afrupacion de tasks (tareas)");
		logger.info("Se crearon " + idJornada + " ornadas");
		return tasksPerWorkingDay;
	}

}
