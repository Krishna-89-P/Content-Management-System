package com.example.cms.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserRequest {

	@NotNull(message = "Fill the username")
	private String userName;
	
	@Pattern(regexp = "[a-zA-Z0-9]+[a-z0-9.%\\-\\+]*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,4}",message = "Invalid Email")
	private String email;
	@Pattern(regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$",message = "Password must"
			+ " contain shoud number, upper case letter,lower case letter, special character, at least 8 charater" )
	private String password;
}