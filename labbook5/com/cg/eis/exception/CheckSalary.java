package com.cg.eis.exception;

import java.util.Scanner;
public class CheckSalary {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		double salary;
		try {
		System.out.println("Enter salary: ");
		salary=sc.nextDouble();
		if(salary<3000) {
			sc.close();
			throw new EmployeeException();
		}
		System.out.println("Valid Salary!");
		sc.close();
		}
		catch(EmployeeException e) {
			System.out.println(e.getMessage());
		}
	}
}
