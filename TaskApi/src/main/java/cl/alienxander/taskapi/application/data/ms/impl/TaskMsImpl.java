package cl.alienxander.taskapi.application.data.ms.impl;

import java.lang.reflect.Type;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import cl.alienxander.taskapi.application.data.ms.TaskMs;
import cl.alienxander.taskapi.application.exception.DataMsException;
import cl.alienxander.taskapi.application.service.impl.TaskServiceImpl;
import cl.alienxander.taskapi.domain.model.Task;
/**
 * 
 * @author Alexander Beck
 * @version 1.0
 * <p>Clase responsable de gestionar llamadas a micro servicios de task</p>
 */
@Component("taskMs")
public class TaskMsImpl implements TaskMs{
	private static final Logger logger = LoggerFactory.getLogger(TaskServiceImpl.class);
	@Value("${application.data.ms.generator.schedule.tasks.url}")
	private String tasksUrl;
	/**
	 * <p>Método que obtiene los task desde el micro servicio task/schedulator</p>
	 * @return Lista de de objetos Task
	 * @since 1.0
	 */
	@Override
	public List<Task> getTasks() throws DataMsException {
		// TODO Auto-generated method stub
		RestTemplate restTemplate = null;
		Gson gson = null;
		String resultadoStr = null;
		try {
			restTemplate = new RestTemplate();
			gson = new Gson();
			resultadoStr = restTemplate.getForObject(tasksUrl, String.class);
			logger.info("Se obtinen las siguientes tareas desde el micro servicio task");
			logger.info(resultadoStr);
			/*Se utiliza Gson para convertir el resultado en objeto, de lo contrario
			 * se obtiene un  LinkedHashMap
			 */
			Type type = new TypeToken<List<Task>>(){}.getType();
		    List<Task> tasks = gson.fromJson(resultadoStr, type);
			return tasks;
		}catch (Exception e) {
			// TODO: handle exception
			throw new DataMsException(e);
		}
		
	}
	
}
