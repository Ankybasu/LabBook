package com.capgemini.authorapp;

import java.util.Collection;
import java.util.Scanner;

import com.capgemini.authorapp.model.Author;
import com.capgemini.authorapp.service.AuthorService;

public class AuthorMain {
		static Scanner ip=new Scanner(System.in);
		static String name;
		static String email;
		static char gender;
		public static void main(String[] args) {
			AuthorService as=new AuthorService();
			char ch='y';
			while(ch=='y') {
				System.out.println("Enter a to add\nEnter g to get details\n");
				System.out.println("Enter the choice: ");
				ch=ip.next().trim().charAt(0);
			switch(ch) {
			case'a':
				readDetails();
				as.addAuthor(name, email, gender);
				break;
			case 'g':
				//Collection<Author> data=as.getAllAuthors();
				//cm.getAllContacts();
				//System.out.println(data);
				for(Author i: as.getAllAuthors()) {
					i.print();
				}
				break;
				default:
					System.out.println("Wrong choice!");
			}//switch close
					System.out.println("Do you want to continue?");
					ch=ip.next().trim().charAt(0);
			}//while close
		}
			public static void readDetails() {
				System.out.println("Enter the author details: ");
				System.out.println("Enter the Name: ");
				name=ip.next();
				System.out.println("Enter the email: ");
				email=ip.next();
				System.out.println("Enter the gender: ");
				gender=ip.next().trim().charAt(0);
			}
}
