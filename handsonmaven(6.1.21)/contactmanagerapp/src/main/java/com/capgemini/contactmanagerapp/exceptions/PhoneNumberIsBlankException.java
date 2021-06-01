package com.capgemini.contactmanagerapp.exceptions;

public class PhoneNumberIsBlankException extends RuntimeException{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PhoneNumberIsBlankException(String message) {
		super(message);
	}
}

