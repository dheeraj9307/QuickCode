package com.dheeraj.exceptionhandling.exception;

public class UserNotFoundException extends RuntimeException{
	public UserNotFoundException(String message){
		super(message);
	}
}
