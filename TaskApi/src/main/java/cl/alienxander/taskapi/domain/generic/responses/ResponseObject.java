package cl.alienxander.taskapi.domain.generic.responses;

import java.io.Serializable;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
/**
 * 
 * @author Alexander Beck
 * @version 1.0
 * <p>Objeto Response o Respuesta, que estandariza la forma de resuesta de la capa Service y la presentación en la capa controller</p>
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Component("responseObject")
public class ResponseObject implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4938332893295269982L;
	@JsonProperty("Body")
	private Object body;
	@JsonProperty("Message")
	private ResponseMessage responseMessage; 
}
