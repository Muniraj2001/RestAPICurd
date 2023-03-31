package com.example.demo.dto;


import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.example.demo.entity.User;

import lombok.Data;

@Data
public class UserDTO {

    
private Long Id;
	
	@Size(min=3, message="Name should have atleast 3 chars")
	private String firstName;
	
	private String lastName;
	
	@NotNull(message = "Dept can not be null")
	private String email;
	
	@Email(message ="Not an valid email")
	private String password;
	
	//@PhoneNumber
	private Long phoneNumber;
}
