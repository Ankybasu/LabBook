package com.capgemini.contactmanagerapp.exceptions;

public class FirstNameBlankException extends RuntimeException{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public FirstNameBlankException(String message) {
		super(message);
	}

}
