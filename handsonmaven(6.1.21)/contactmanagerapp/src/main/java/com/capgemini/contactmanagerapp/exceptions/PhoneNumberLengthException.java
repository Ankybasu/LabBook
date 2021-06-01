package com.capgemini.contactmanagerapp.exceptions;

public class PhoneNumberLengthException extends RuntimeException{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PhoneNumberLengthException(String message) {
		super(message);
	}
}
