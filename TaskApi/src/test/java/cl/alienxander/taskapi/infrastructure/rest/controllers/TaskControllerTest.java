package cl.alienxander.taskapi.infrastructure.rest.controllers;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import cl.alienxander.taskapi.domain.generic.responses.ResponseObject;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskControllerTest {
	@Autowired
	TaskController taskController;
	@Autowired
	ResponseObject responseObject;
	
	@BeforeEach
	void setUp() throws Exception {
	}
	
	@Test
	void apiRestBodyNotNull() {
		responseObject = taskController.getTasksPerWorkingDay();
		
		assertNotNull(responseObject.getBody());
	}
	
	@Test
	void apiRestMessageNotNull() {
		responseObject = taskController.getTasksPerWorkingDay();
		
		assertNotNull(responseObject.getResponseMessage());
	}
	
	@Test
	void apiRestMessageListExist() {
		responseObject = taskController.getTasksPerWorkingDay();
		
		assertTrue(responseObject.getResponseMessage().getMessageList().size() > 0);
	}
	
	@Test
	void apiRestMessageResponse200() {
		responseObject = taskController.getTasksPerWorkingDay();
		
		assertEquals("200", responseObject.getResponseMessage().getMessageList().get(0).getCode());
	}
}
