package arithmeticoperations;
import java.util.Scanner;
public class Ascii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		char ch;
		System.out.println("Enter a character");
		ch=sc.next().charAt(0);
		System.out.println("Ascii value: "+(int)ch);
		sc.close();
		
	}

}
