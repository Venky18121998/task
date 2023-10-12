package com.controller_test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.userentity.UserEntity;
import com.userpojo.UserPojo;
import com.userrepository.UserRepository;
import com.userserviceimpl.UserServiceImpl;

@ExtendWith(SpringExtension.class)
public class UserServiceImplTest {
	
	@InjectMocks
	UserServiceImpl userServiceImpl;
	
	@Mock
	UserRepository userRepository;
	
	@Test
	@Order(1)
	public void saveUserDetails_Test() {
		
		UserPojo user = new UserPojo(1, "venky", "nalamalapu", "venky@gmail.com", "7995977969", "venlkat",
				"venky@1234", "venky@1234", "1999-12-18");
		UserEntity entity = new UserEntity(1, "venky", "nalamalapu", "venky@gmail.com", "7995977969", "venlkat",
				"venky@1234", "venky@1234", "1999-12-18");
		Mockito.when(userRepository.save(entity)).thenReturn(entity);
		UserPojo pojo = userServiceImpl.saveUserDetails(user);
		assertEquals(pojo,user);
	}

}
