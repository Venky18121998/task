package com.userpojo;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserPojo {
	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private String mobile_Number;
	private String userName;
	private String password;
	private String confirm_Password;
	private String dateOfBirth;

}
