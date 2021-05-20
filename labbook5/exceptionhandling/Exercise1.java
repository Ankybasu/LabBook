package exceptionhandling;

import java.util.Scanner;
class InvalidAgeException extends RuntimeException{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public InvalidAgeException(String str){
		super(str);
	}
}
public class Exercise1 {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int age;
		try {
		System.out.println("Enter the age: ");
		age=sc.nextInt();
		if(age<15) {
			sc.close();
			throw new InvalidAgeException("Age should be above 15!");
		}
		System.out.println("Age validated!");
		sc.close();
		}
		catch(InvalidAgeException e) {
			System.out.println(e.getMessage());
		}
	}
}
