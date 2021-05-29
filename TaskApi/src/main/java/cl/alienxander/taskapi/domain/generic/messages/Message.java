package cl.alienxander.taskapi.domain.generic.messages;

import java.io.Serializable;

import cl.alienxander.taskapi.domain.generic.types.enums.MessageType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Message implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3607694924302746583L;
	private String code;
	private MessageType type;
	private String shortDescription;
	private String description;
}
