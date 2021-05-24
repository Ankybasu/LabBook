package payrollpolymorphism;

import java.util.Scanner;

public class Admin extends Payroll{
	private String name;
	private double salary;
	Scanner sc=new Scanner(System.in);
	public Admin(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	public void adjustSalary(int amt) {
		System.out.println("Increment or decrement? i/d");
		char ch=sc.next().charAt(0);
		if(ch=='i') {
			double newsalary;
			newsalary=getSalary()+amt;
			setSalary(newsalary);
			System.out.println(getSalary());
		}
		else if(ch=='d') {
				double newsalary;
				newsalary=getSalary()-amt;
				setSalary(newsalary);
				System.out.println(getSalary());
			}
		else {
			System.out.println("Wrong choice");
		}
	}
	public void doAdminStuff() {
		System.out.println("Admin stuff!");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
}
