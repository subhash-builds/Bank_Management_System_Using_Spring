package com.bank.exception;

public class AdminDetailsException extends RuntimeException {

	private String expMessage;

	public AdminDetailsException(String expMessage) {
		super();
		this.expMessage = expMessage;
	}

	public AdminDetailsException() {
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
		return "AdminDetailsException [expMessage=" + expMessage + "]";
	}

}
