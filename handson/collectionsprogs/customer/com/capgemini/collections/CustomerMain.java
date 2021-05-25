package com.capgemini.collections;

import java.util.Scanner;


public class CustomerMain {
	public static void main(String[] args){
		Customer c;
		CustomerService ob=new CustomerServiceImpl();
		Scanner sc=new Scanner(System.in);
		char ch='y';
		do {
			System.out.println("Customer Menu");
			System.out.println("=======================");
			System.out.println("1 to create: ");
			System.out.println("2 to display details: ");
			System.out.println("3 to display by id: ");
			System.out.println("4 to delete: ");
			System.out.println("5 to update: ");
			System.out.println("Enter your choice: ");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				c=new Customer();
				ob.create(c);
				break;
			case 2:
				ob.displayAll();
				break;
			case 3:
				System.out.println("Enter the id to display the details: ");
				ob.displayById(sc.nextInt());
				break;
			case 4:
				System.out.println("Enter the id to be deleted: ");
				ob.delete(sc.nextInt());
				break;
			case 5:
				System.out.println("Enter the id of the customer to be updated: ");
				if(ob.update(sc.nextInt()))
					System.out.println("Updated!");
				else
					System.out.println("No such record found!");
				break;
			default:
				System.out.println("Wrong Choice!");
			}
			System.out.println("Continue? y/n");
			ch=sc.next().trim().charAt(0);
		}while(ch=='y');
		sc.close();
	}
}
