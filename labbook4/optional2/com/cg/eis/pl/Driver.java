package com.cg.eis.pl;

import java.util.Scanner;

import com.cg.eis.bean.Employee;
import com.cg.eis.service.EmployeeServiceImpl;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Employee e=new Employee();
		EmployeeServiceImpl ob1=new EmployeeServiceImpl();
		char c='y';
		do {
		System.out.println("Enter choice:\n 1 for entering employee details\n 2 for entering insurance scheme\n 3 for displaying employee details ");
		int ch=sc.nextInt();
		if(ch==1) {
			ob1.setEmployeeDetails(e);
		}
		if(ch==2) {
			ob1.setInsuranceScheme(e);
		}
		if(ch==3) {
			ob1.display(e);
		}
		if(ch==0) {
			System.exit(0);
		}
		System.out.println("continue? enter y/n");
		 c=sc.next().charAt(0);
		}while(c=='y');
		sc.close();

	}

}
