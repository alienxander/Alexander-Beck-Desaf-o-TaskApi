package cl.alienxander.taskapi.application.data.ms;

import java.util.List;

import cl.alienxander.taskapi.application.exception.DataMsException;
import cl.alienxander.taskapi.domain.model.Task;

public interface TaskMs {
	public List<Task> getTasks() throws DataMsException;
}
