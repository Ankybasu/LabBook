package payrollpolymorphism;
import java.util.Scanner;
public class Academic extends Payroll{
	private String name;
	private double salary;
	Scanner sc=new Scanner(System.in);
	public Academic(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Academic [name=" + name + ", salary=" + salary + "]";
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
	public void giveLecture() {
		System.out.println(name+" gives lecture!");
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
