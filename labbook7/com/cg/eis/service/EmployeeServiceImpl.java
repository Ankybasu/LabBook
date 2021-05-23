package com.cg.eis.service;

import java.util.Scanner;

import com.cg.eis.bean.Employee;




public class EmployeeServiceImpl implements EmployeeService {
	Scanner scan=new Scanner(System.in);
	@Override
	public void getEmployeeDetails(Employee e) {
		// TODO Auto-generated method stub
		System.out.println("Enter the employee details: ");
		System.out.println("Name");
		e.setName(scan.nextLine());
		System.out.println("salary");
		e.setSalary(scan.nextDouble());
		System.out.println("designation");
		scan.nextLine();
		e.setDesignation(scan.nextLine());
		e.setId();
	}


	@Override
	public void display(Employee e) {
		// TODO Auto-generated method stub
		System.out.println(e);
	}


	@Override
	public void findInsuranceScheme(Employee e) {
		// TODO Auto-generated method stub
		if(e.getSalary()>5000 && e.getSalary()<20000 && e.getDesignation().equalsIgnoreCase("System Associate")) {
			e.setInsuranceScheme("Scheme C");
		}
		if(e.getSalary()>=20000 && e.getSalary()<40000  && e.getDesignation().equalsIgnoreCase("Programmer")) {
			e.setInsuranceScheme("Scheme B");
		}
		if(e.getSalary()>=20000 && e.getSalary()<40000  && e.getDesignation().equalsIgnoreCase("Manager")) {
			e.setInsuranceScheme("Scheme A");
		}
		if(e.getSalary()<5000 && e.getDesignation().equalsIgnoreCase("Clerk")) {
			e.setInsuranceScheme("No Scheme");
		}	
		
	}
}
