package com.cg.eis.service;

import java.util.Scanner;

import com.cg.eis.bean.Employee;




public class EmployeeServiceImpl implements EmployeeService {
	Scanner scan=new Scanner(System.in);
	@Override
	public void setEmployeeDetails(Employee e) {
		// TODO Auto-generated method stub
		System.out.println("Id");
		e.setId(scan.nextInt());
		System.out.println("Name");
		scan.nextLine();
		e.setName(scan.nextLine());
		System.out.println("salary");
		e.setSalary(scan.nextDouble());
		System.out.println("designation");
		e.setDesignation(scan.next());
	}

	@Override
	public void setInsuranceScheme(Employee e) {
		// TODO Auto-generated method stub
		System.out.println("Enter insurance: ");
		e.setInsuranceScheme(scan.next());
		
		
	}

	@Override
	public void display(Employee e) {
		// TODO Auto-generated method stub
		System.out.println(e);
	}

}
