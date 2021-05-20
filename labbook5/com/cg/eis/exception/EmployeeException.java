package com.cg.eis.exception;

public class EmployeeException extends RuntimeException{
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		EmployeeException(){
			super("Salary below 3000 not allowed!");
		}
}
