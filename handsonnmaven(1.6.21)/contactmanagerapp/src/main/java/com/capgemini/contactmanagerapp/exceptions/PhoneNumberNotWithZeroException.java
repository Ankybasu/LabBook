package com.capgemini.contactmanagerapp.exceptions;

public class PhoneNumberNotWithZeroException extends RuntimeException{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PhoneNumberNotWithZeroException(String message) {
		super(message);
	}
}