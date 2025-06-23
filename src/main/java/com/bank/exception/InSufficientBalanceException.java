package com.bank.exception;

public class InSufficientBalanceException extends RuntimeException {

	private String excMessage;

	public InSufficientBalanceException(String excMessage) {
		super();
		this.excMessage = excMessage;
	}

	public InSufficientBalanceException() {
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
		return "InSufficientBalanceException [excMessage=" + excMessage + "]";
	}

}
