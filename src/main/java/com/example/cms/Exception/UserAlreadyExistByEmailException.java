package com.example.cms.Exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class UserAlreadyExistByEmailException extends RuntimeException {

	private String message;
}
