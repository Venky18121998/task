package com.usercontroller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.userpojo.UserPojo;
import com.userservice.UserService;

@RestController
public class UserController {

	private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);

	@Autowired
	UserService userService;

	@PostMapping("/saveUserDetails")
	public ResponseEntity<UserPojo> userDetailsSaved(@RequestBody UserPojo userPojo) {

		LOGGER.info("user details are saved in database:{}", userPojo);

		UserPojo userpojo = userService.saveUserDetails(userPojo);

		if (userpojo != null) {
			return new ResponseEntity<UserPojo>(userpojo, HttpStatus.ACCEPTED);

		} else {
			return new ResponseEntity<UserPojo>(userpojo, HttpStatus.BAD_REQUEST);
		}

	}

}
