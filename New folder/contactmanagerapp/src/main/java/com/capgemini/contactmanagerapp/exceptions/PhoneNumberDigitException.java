package com.capgemini.contactmanagerapp.exceptions;

public class PhoneNumberDigitException extends RuntimeException{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PhoneNumberDigitException(String message) {
		super(message);
	}
}