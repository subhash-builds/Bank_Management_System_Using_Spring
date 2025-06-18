package com.bank.exception;

public class UserLoginException extends RuntimeException {

	private String message;

	public UserLoginException(String message) {
		super();
		this.message = message;
	}

	@Override
	public String toString() {
		return "UserLoginException [message=" + message + "]";
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public UserLoginException() {
		super();
		// TODO Auto-generated constructor stub
	}

}
