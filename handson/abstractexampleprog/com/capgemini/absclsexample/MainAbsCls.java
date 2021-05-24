package com.capgemini.absclsexample;

import java.util.Scanner;

public class MainAbsCls {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch = 'y';
		BankAccount sa = null;
		System.out.println("Enter the choice");
		System.out.println("SavingsAccount");
		System.out.println("CurrentAccount");
		System.out.println("FixedDeposit");
		String acc=sc.next();
		if(acc.equalsIgnoreCase("SavingsAccount")) {
		 sa = new SavingsAccount();
		 sa.openAccount();
		}
		else if(acc.equalsIgnoreCase("CurrentAccount")) {
		 sa = new CurrentAccount();
		 sa.openAccount();
		}
		else if(acc.equalsIgnoreCase("FixedDeposit")) {
		 sa = new FixedDepositAccount();
		 sa.openAccount();
		}
		else {
			System.out.println("Invalid Choice!");
		}
		while (ch == 'y') {
			System.out.println("Enter the choice");
			System.out.println("addMoney");
			System.out.println("withDrawMoney");
			System.out.println("CheckBal");
			String option = sc.next();
			switch (option) {
			case "addMoney":
				sa.addMoney();
				break;
			case "withDrawMoney":
				sa.withDraw();
				break;
			case "CheckBal":
				sa.checkBalance();
				break;
			default:
				System.out.println("Not valid option");

			}// switch close
			System.out.println("do you want to continue");
			ch = sc.next().trim().charAt(0);
		} // while close
		sc.close();
	}// main method close
}// class close