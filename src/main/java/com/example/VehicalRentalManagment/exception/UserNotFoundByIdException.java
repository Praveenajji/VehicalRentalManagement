package com.example.VehicalRentalManagment.exception;

public class UserNotFoundByIdException extends RuntimeException {
	private String message;

	public UserNotFoundByIdException(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
}
