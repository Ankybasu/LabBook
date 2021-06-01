package capgemini.com.atmsystem.main;

import java.util.Scanner;

import capgemini.com.atmsystem.account.Transaction;
import capgemini.com.atmsystem.atm.ATM;
import capgemini.com.atmsystem.card.CardScanner;
import capgemini.com.atmsystem.model.BankCustomerImpl;

public class DisplayScreen{
			public static void main(String[] args)  {
				Scanner sc=new Scanner(System.in);
				ATM at=new ATM("Kolkata","Noapara");
				System.out.println(at);
				BankCustomerImpl f=new BankCustomerImpl();
				while(true) {
					System.out.println("User Creation:");
					System.out.println("================================");
					System.out.println("1 to create account: ");
					System.out.println("2 to update account: ");
					System.out.println("3 to display Account details: ");
					System.out.println("4 for Atm withdrawal: ");
					System.out.println("5 for transaction: ");
					System.out.println("0 to exit: ");
					System.out.println("Enter your choice: ");
					int choice=sc.nextInt();
					switch(choice) {
					case 1:
						f.create();
						break;
					case 2:
						f.update();
						break;
					case 3:
						f.display();
						break;
					case 4:
						System.out.println("Enter your card details: ");
						System.out.println("============================");
						System.out.println("Enter the card Id: ");
						CardScanner card=new CardScanner();
						long cardId=sc.nextLong();
						if(card.acceptCard(cardId)) {
							card.ReadCard();
							card.ejectCard();
						}
						else {
							System.out.println("Invalid Pin!");
						}
						break;
					case 5:
						System.out.println("Enter accountNo: ");
						int accNo=sc.nextInt();
						System.out.println("Enter the amount to be deposited: ");
						double amt=sc.nextDouble();
						while(true) {
							Transaction t=new Transaction();
						t.StartTransaction();
						t.setDate();
						t.setDeposit(amt);
						t.setAmount(accNo);
						System.out.println(t);
						System.out.println("Enter 0 to stop transaction: ");
						System.out.println("Enter choice: ");
						int chh=sc.nextInt();
						if(chh==0) {
							t.CancelTransaction();
							break;
						}
						else {
							System.out.println("Wrong choice!");
						}
						}
						break;
						
					case 0:
						System.exit(0);
						default:
							System.out.println("Wrong choice!");
							}
					}
				}
}

