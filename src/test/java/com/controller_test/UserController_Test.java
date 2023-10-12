package com.controller_test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.usercontroller.UserController;
import com.userentity.UserEntity;
import com.userpojo.UserPojo;
import com.userrepository.UserRepository;
import com.userservice.UserService;

@ExtendWith(SpringExtension.class)
public class UserController_Test {

	@InjectMocks
	UserController userController;
	@Mock
	UserService userService;

	@Test
	@Order(1)
	public void userDetailsSaved_Test() {
		UserPojo user = new UserPojo(1, "venky", "nalamalapu", "venky@gmail.com", "7995977969", "saveAllkat",
				"venky@1234", "venky@1234", "1999-12-18");
		UserEntity entity = new UserEntity(1, "venky", "nalamalapu", "venky@gmail.com", "7995977969", "venlkat",
				"venky@1234", "venky@1234", "1999-12-18");
		Mockito.when(userService.saveUserDetails(user)).thenReturn(user);
		ResponseEntity<UserPojo> hello =  userController.userDetailsSaved(user);
		assertEquals(HttpStatus.ACCEPTED, hello.getStatusCode());
	}
	
	@Test
	@Order(2)
	public void userDetailsSaved() {
		UserPojo user = new UserPojo();
		UserEntity entity = new UserEntity();
		Mockito.when(userService.saveUserDetails(null)).thenReturn(null);
		ResponseEntity<UserPojo> hello =  userController.userDetailsSaved(null);
		assertEquals(HttpStatus.BAD_REQUEST, hello.getStatusCode());
	}

}
