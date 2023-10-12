package com.userserviceimpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.userentity.UserEntity;
import com.userpojo.UserPojo;
import com.userrepository.UserRepository;
import com.userservice.UserService;

@Service
public class UserServiceImpl implements UserService {

	private static final Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);

	@Autowired
	UserRepository userRepository;

	@Override
	public UserPojo saveUserDetails(UserPojo userPojo) {
		// TODO Auto-generated method stub
		LOGGER.info("saving user details into the data base:{}", userPojo);

		UserEntity user = new UserEntity(userPojo.getId(), userPojo.getFirstName(), userPojo.getLastName(),
				userPojo.getEmail(), userPojo.getMobile_Number(), userPojo.getUserName(), userPojo.getPassword(),
				userPojo.getConfirm_Password(), userPojo.getDateOfBirth());
		UserPojo userpojo = new UserPojo();
		UserEntity userentity = userRepository.save(user);
		BeanUtils.copyProperties(userentity,userpojo);

		return userpojo;
	}

}
