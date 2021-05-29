package cl.alienxander.taskapi.application.delegate;

import cl.alienxander.taskapi.application.exception.ServiceException;
import cl.alienxander.taskapi.domain.generic.responses.ResponseObject;

public interface TaskDelegate {
	ResponseObject getTasksPerWorkingDay();
}
