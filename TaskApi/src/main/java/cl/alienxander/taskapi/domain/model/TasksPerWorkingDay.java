package cl.alienxander.taskapi.domain.model;

import java.io.Serializable;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TasksPerWorkingDay implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -6997710437927577192L;
	private int hrs_jornada;
	private int dias_termino;
	private List<WorkingDay> jornadas;
	
}
