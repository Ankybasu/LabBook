package exceptionhandling;

import java.util.Scanner;
class InvalidNameException extends RuntimeException{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	InvalidNameException(String str){
		super(str);
	}
}
public class Exercise2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String firstName,lastName;
		try {
		System.out.println("Enter the first name: ");
		firstName=sc.nextLine();
		if(firstName.equals("")) {
			sc.close();
			throw new InvalidNameException("Empty FirstName!");
		}
		System.out.println("Enter the last name: ");
		lastName=sc.nextLine();
		if(lastName.equals("")) {
			sc.close();
			throw new InvalidNameException("Empty LastName!");
		}
		System.out.println("Name verified: "+firstName+" "+lastName);
		sc.close();
		}
		catch(InvalidNameException e) {
			System.out.println(e.getMessage());
		}
	}
}
