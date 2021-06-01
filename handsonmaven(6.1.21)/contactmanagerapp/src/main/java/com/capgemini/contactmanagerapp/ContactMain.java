package com.capgemini.contactmanagerapp;

import java.util.Collection;
import java.util.Scanner;

import com.capgemini.contactmanagerapp.model.Contact;
import com.capgemini.contactmanagerapp.service.ContactManager;

public class ContactMain {
	static Scanner ip=new Scanner(System.in);
	static String fName;
	static String lName;
	static String phoneNo;
	public static void main(String[] args) {
		ContactManager cm=new ContactManager();
		char ch='y';
		while(ch=='y') {
			System.out.println("Enter a to add\nEnter g to get details\n");
			System.out.println("Enter the choice: ");
			ch=ip.next().trim().charAt(0);
		switch(ch) {
		case'a':
			readDetails();
			cm.addContact(fName, lName, phoneNo);
			break;
		case 'g':
			Collection<Contact> data=cm.getAllContacts();
			//cm.getAllContacts();
			System.out.println(data);
			break;
			default:
				System.out.println("Wrong choice!");
		}//switch close
				System.out.println("Do you want to continue?");
				ch=ip.next().trim().charAt(0);
		}//while close
	}
		public static void readDetails() {
			System.out.println("Enter the contact details: ");
			System.out.println("Enter the first Name: ");
			fName=ip.next();
			System.out.println("Enter the last Name: ");
			lName=ip.next();
			System.out.println("Enter the phone No: ");
			phoneNo=ip.next();
		}

}
