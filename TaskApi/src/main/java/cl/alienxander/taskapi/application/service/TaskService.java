package cl.alienxander.taskapi.application.service;

import cl.alienxander.taskapi.domain.generic.responses.ResponseObject;

public interface TaskService{
	ResponseObject getTasksPerWorkingDay();
}
