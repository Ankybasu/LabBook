package com.capgemini.exceptionhandling;

public class MobileNumberInvalid extends RuntimeException{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MobileNumberInvalid(String str) {
		super(str);
	}
}

