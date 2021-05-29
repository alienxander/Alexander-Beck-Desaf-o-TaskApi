package cl.alienxander.taskapi.domain.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Task implements Serializable, Comparable<Task>{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4950644921213359128L;
	private String task_id;
	private String task_name;
	private int duration;
	@Override
	public int compareTo(Task o) {
		// TODO Auto-generated method stub
		return o.getDuration() < this.duration ? -1
		         : o.getDuration() > this.duration ? 1
		         : 0;
	}
	

	
}
