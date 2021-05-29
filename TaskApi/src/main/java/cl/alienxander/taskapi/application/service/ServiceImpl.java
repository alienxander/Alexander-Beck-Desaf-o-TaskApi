package cl.alienxander.taskapi.application.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.MessageSource;

import cl.alienxander.taskapi.domain.generic.messages.Message;
import cl.alienxander.taskapi.domain.generic.responses.ResponseMessage;
import cl.alienxander.taskapi.domain.generic.types.enums.MessageType;

public abstract class ServiceImpl {
	@Value("${application.commons.language}")
	private String messageLanguage;
	
	@Autowired
	private MessageSource messageSource;
	@Autowired
	private ResponseMessage responseMessage;
	
	protected ResponseMessage getServiceMessageOk() {
		Message message = new Message();
		List<Message> messageList = new ArrayList<Message>(); 
		message.setCode(getResourceMessage("application.service.message.generic.ok.code"));
		message.setShortDescription(getResourceMessage("application.service.message.generic.ok.shortDescription"));
		message.setDescription(getResourceMessage("application.service.message.generic.ok.description"));
		message.setType(MessageType.OK);
		messageList.add(message);
		responseMessage.setMessageList(messageList);
		return responseMessage;
	}
	
	protected ResponseMessage getServiceMessageError() {
		Message message = new Message();
		List<Message> messageList = new ArrayList<Message>(); 
		message.setCode(getResourceMessage("application.service.message.generic.error1.code"));
		message.setShortDescription(getResourceMessage("application.service.message.generic.error1.shortDescription"));
		message.setDescription(getResourceMessage("application.service.message.generic.error1.description"));
		message.setType(MessageType.ERROR);
		messageList.add(message);
		responseMessage.setMessageList(messageList);
		return responseMessage;
	}
	
	private String getResourceMessage(String key) {
		return messageSource.getMessage(key, null, new Locale(messageLanguage));
	}
}
