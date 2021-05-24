package com.capgemini.contactmanager;

public class MainContact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Contact c=new Contact();
		c.readDetails();
		String ot=c.displayDetails();
		System.out.println(ot);
	}

}
