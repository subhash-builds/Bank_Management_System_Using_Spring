package com.bank.exception;

public class InvalidBankUserDetailsException extends RuntimeException {

	private String message;

	public InvalidBankUserDetailsException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public InvalidBankUserDetailsException(String message) {
		super();
		this.message = message;
	}

	@Override
	public String toString() {
		return "InValidBankUserDetailsException [message=" + message + "]";
	}

}
