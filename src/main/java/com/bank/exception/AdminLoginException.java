package com.bank.exception;

public class AdminLoginException extends RuntimeException {

	private String expMessage;

	public AdminLoginException(String expMessage) {
		super();
		this.expMessage = expMessage;
	}

	public AdminLoginException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getExpMessage() {
		return expMessage;
	}

	public void setExpMessage(String expMessage) {
		this.expMessage = expMessage;
	}

	@Override
	public String toString() {
		return "AdminLoginException [expMessage=" + expMessage + "]";
	}

}
