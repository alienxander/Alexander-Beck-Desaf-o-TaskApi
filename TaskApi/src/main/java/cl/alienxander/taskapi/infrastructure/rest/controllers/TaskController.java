package cl.alienxander.taskapi.infrastructure.rest.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import cl.alienxander.taskapi.application.delegate.TaskDelegate;
import cl.alienxander.taskapi.application.exception.ServiceException;
import cl.alienxander.taskapi.domain.generic.responses.ResponseObject;
/**
 * 
 * @author Alexander Beck
 * @version 1.0
 * <p>Api Rest encargada de administrar y gestionar las tareas o trabajos de la empresa</p>
 * @see <a href="http://localhost:8001/swagger-ui.html">Swagger documentation</a>
 */

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/task")
public class TaskController {
	private static final Logger logger = LoggerFactory.getLogger(TaskController.class);
	/**
	 * Da acceso al Delegate de los task o tareas
	 */
	@Autowired
	private TaskDelegate taskDelegate;
	
	/**
	 * <p>Este método define el acceso a la api rest que agrupa las tareas por día de trabajo. Para acceder al método por rest, ir a la siguiente <a href="http://localhost:8001/task/tasksPerWorkingDay">URL</a>
	 * </p>
	 * @return Objeto de tipo ResponseObject
	 * @see <a href="http://localhost:8001/swagger-ui.html">Swagger documentation</a>
	 * @since 1.0
	 */
	@RequestMapping(value="/tasksPerWorkingDay", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseObject getTasksPerWorkingDay() {		
		logger.info("Inicio llamada a tasksPerWorkingDay API");
		return taskDelegate.getTasksPerWorkingDay();
		
	}
}
