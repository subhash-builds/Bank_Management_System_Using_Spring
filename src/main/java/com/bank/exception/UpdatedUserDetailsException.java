package com.bank.exception;

public class UpdatedUserDetailsException extends RuntimeException {

	private String excMessage;

	public UpdatedUserDetailsException(String excMessage) {
		super();
		this.excMessage = excMessage;
	}

	public UpdatedUserDetailsException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getExcMessage() {
		return excMessage;
	}

	public void setExcMessage(String excMessage) {
		this.excMessage = excMessage;
	}

	@Override
	public String toString() {
		return "UpdatedUserDetailsException [excMessage=" + excMessage + "]";
	}

}
