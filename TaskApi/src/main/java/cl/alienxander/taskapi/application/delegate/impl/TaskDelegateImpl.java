package cl.alienxander.taskapi.application.delegate.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import cl.alienxander.taskapi.application.delegate.TaskDelegate;
import cl.alienxander.taskapi.application.service.TaskService;
import cl.alienxander.taskapi.domain.generic.responses.ResponseObject;

@Component("taskDelegate")
public class TaskDelegateImpl implements TaskDelegate{
	@Autowired
	private TaskService taskService;
	@Override
	public ResponseObject getTasksPerWorkingDay() {
		// TODO Auto-generated method stub
		return taskService.getTasksPerWorkingDay();
	}

}
