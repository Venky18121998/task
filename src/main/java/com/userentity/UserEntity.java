package com.userentity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "User_Details_Table")
public class UserEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

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
