package com.capgemini.exceptionhandling;

import java.util.Scanner;
public class Mobile {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String mob;
		try {
			System.out.println("Enter mobile number: ");
			mob=sc.next();
			if(mob.length()<10||mob.length()>10) {
				throw new MobileNumberInvalid("Mobile Number Not Valid!");
			}
			System.out.println("Valid Mobile Number!");
		}
		catch(MobileNumberInvalid e) {
			System.out.println(e.getMessage());
		}
		finally {
			sc.close();
		}
	}
}
