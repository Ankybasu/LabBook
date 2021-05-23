package com.cg.eis.pl;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.cg.eis.bean.Employee;
import com.cg.eis.service.EmployeeService;
import com.cg.eis.service.EmployeeServiceImpl;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		Employee e;
		HashMap<Integer,Employee> map = new HashMap<>();
		EmployeeService ob1=new EmployeeServiceImpl();
		char c='y';
		do {
//Add employee details to Hashmap. 
//
//Accept insurance scheme from user and display employee details based on Insurance scheme. 
//
//Delete an employee details from map. 
//
//Build Expectation 
		System.out.println("Enter choice:\n"
				+ " 1 for entering employee details\n"
				+ " 2 for Accepting insurance scheme from user and display employee details based on Insurance scheme.\n"
				+ " 3 to remove employee details");
		int ch=sc.nextInt();
		if(ch==1) {
			e=new Employee();
			ob1.getEmployeeDetails(e);
			ob1.findInsuranceScheme(e);
			map.put(e.getId(),e);
		}
		if(ch==2) {
			//Accept insurance scheme from user and display employee details based on Insurance scheme.
			System.out.println("Enter insurance scheme: ");
			sc.nextLine();
			String str=sc.nextLine();
		    for(Map.Entry<Integer,Employee> entry:map.entrySet()){    
		        Employee b=entry.getValue();  
		        if(b.getInsuranceScheme().equalsIgnoreCase(str)) {
		        	ob1.display(b);
		        }
		    } 
		}
		if(ch==3) {
			System.out.println("Enter employee id: ");
			int id=sc.nextInt();
		    for(Map.Entry<Integer,Employee> entry:map.entrySet()){    
		        Integer key=entry.getKey();  
		        Employee b=entry.getValue();  
		        if(b.getId()==id) {
		        	map.remove(key);
		        	break;
		        }
		    }    	
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

