package com.capgemini.app.exceptions;

public class InvalidEmailException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidEmailException(String str){
		super(str);
	}
}
