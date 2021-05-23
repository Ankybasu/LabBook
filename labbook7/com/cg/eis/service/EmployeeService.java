package com.cg.eis.service;

import com.cg.eis.bean.Employee;

public interface EmployeeService {
	//Get employee details from user.
	void getEmployeeDetails(Employee e);
	//the insurance scheme for an employee based on salary and designation. 
 	void findInsuranceScheme(Employee e);
 	//	Display all the details of an employee. 
	void display(Employee e);

}
