package cl.alienxander.taskapi.domain.generic.responses;

import java.io.Serializable;
import java.util.List;

import org.springframework.stereotype.Component;

import cl.alienxander.taskapi.domain.generic.messages.Message;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Component("responseMessage")
public class ResponseMessage implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 770340600387691402L;
	private List<Message> messageList;
}
