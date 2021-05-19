package payrollpolymorphism;

import java.util.Scanner;
public class Driver {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int choice;
		String name;
		double sal;
		char ch='y';
		do {
			System.out.println("1 for Admin\n2 for Academic ");
			System.out.println("Enter your choice: ");
			choice=scan.nextInt();
			if(choice==1) {
				System.out.println("Enter name: ");
				scan.nextLine();
				name=scan.nextLine();
				System.out.println("Enter salary: ");
				sal=scan.nextDouble();
				Admin a=new Admin(name,sal);
				System.out.println("1 to adjust salary\n 2 to doAdminStuff ");
				int choice2=scan.nextInt();
				if(choice2==1) {
					System.out.println("enter amount: ");
					int amt=scan.nextInt();
					a.adjustSalary(amt);
				}
				else if(choice2==2) {
					a.doAdminStuff();
				}
				else {
					System.out.println("Invalid Choice!");
				}
			}
			else if(choice==2) {
				System.out.println("Enter name: ");
				scan.nextLine();
				name=scan.nextLine();
				System.out.println("Enter salary: ");
				sal=scan.nextDouble();
				Academic ac=new Academic(name,sal);
				System.out.println("1 to adjust salary\n 2 to give Lecture ");
				int choice2=scan.nextInt();
				if(choice2==1) {
					System.out.println("enter amount: ");
					int amt=scan.nextInt();
					ac.adjustSalary(amt);
				}
				else if(choice2==2) {
					ac.giveLecture();
				}
				else {
					System.out.println("Invalid Choice!");
				}
			}
			else {
				System.out.println("invalid choice!");
			}
			System.out.println("Continue?? Enter y/n");
			ch=scan.next().charAt(0);
		}while(ch=='y');
		scan.close();
	}
}
