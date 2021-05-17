package javaprograms;
import java.util.Scanner;
public class SymbolDigit {
	static void charCheck(char input_char)
	{
		// CHECKING FOR ALPHABET
		if ((input_char >= 65 && input_char <= 90)
			|| (input_char >= 97 && input_char <= 122))
			System.out.println(" Alphabet ");

		// CHECKING FOR DIGITS
		else if (input_char >= 48 && input_char <= 57)
			System.out.println(" Digit ");

		// OTHERWISE SPECIAL CHARACTER
		else
			System.out.println(" Special Character ");
	}

	// Driver Code
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		System.out.println("Enter the index: ");
		int i=sc.nextInt();
		char input_char = str.charAt(i);
		charCheck(input_char);
		sc.close();
	}
}
