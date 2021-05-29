package cl.alienxander.taskapi.domain.model;

import java.io.Serializable;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class WorkingDay implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 2970768443379558483L;
	private int id;
	private int timeToDone;
	private List<String> taskList;
}
