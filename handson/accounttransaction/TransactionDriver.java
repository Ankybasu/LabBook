package accounttransaction;

import java.util.Scanner;

public class TransactionDriver {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num;
		double balance;
		char c='y';
		System.out.println("Create an account and for the transaction: ");
		System.out.println("Enter account number: ");
		num=sc.nextInt();
		System.out.println("Enter balance to create: ");
		balance=sc.nextDouble();
		Transaction t=new Transaction(num,balance);
		t.execute();
		do {
			System.out.println("1 Balance Enquiry\n2 Withdrawal\n3 Deposit");
			System.out.println("Enter your choice: ");
			int ch=sc.nextInt();
		if(ch==1) {
			BalanceInquiry b=new BalanceInquiry();
			b.setT(t);
			b.execute();
		}
		else if(ch==2) {
			Withdrawal w=new Withdrawal();
			w.setT(t);
			System.out.println("Enter amount to be withdrawn: ");
			w.setAmount(sc.nextDouble());
			w.execute();
		}
		else if(ch==3) {
			Deposit d=new Deposit();
			d.setT(t);
			System.out.println("enter amount to be deposited: ");
			d.setAmount(sc.nextDouble());
			d.execute();
		}
		else {
			System.out.println("Invalid Choice!");
		}
		System.out.println("Continue?? y/n");
		c=sc.next().charAt(0);
		}while(c=='y');
		sc.close();
	}
}
