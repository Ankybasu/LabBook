package controlstatements;
import java.util.Scanner;
public class ValidateAge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age:");
		int age=sc.nextInt();
		if(age>18)
			System.out.println("Age is valid");
		else
			System.out.println("Age not valid");
		sc.close();
	}

}
