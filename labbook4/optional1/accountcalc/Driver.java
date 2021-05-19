package accountcalc;

import java.util.Scanner;

public class Driver{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Account smith=new Account();
		Account Kathy=new Account();
		Person ob1=new Person();
		Person ob2=new Person();
		smith.setBalance(2000);
		ob1.setName("smith");
		System.out.println("Enter age of Smith: ");
		ob1.setAge(sc.nextInt());
		smith.setAccHolder(ob1);
		ob2.setName("Kathy");
		Kathy.setBalance(3000);
		System.out.println("Enter age of Kathy: ");
		ob2.setAge(sc.nextInt());
		Kathy.setAccHolder(ob2);
		smith.deposit(2000);
		Kathy.withdraw(2000);
		System.out.println(smith);
		System.out.println(Kathy);
		sc.close();
	}

}
