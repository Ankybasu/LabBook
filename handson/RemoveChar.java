package javaprograms;
import java.util.Scanner;
public class RemoveChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str=sc.nextLine();
		System.out.println("Enter the character to be removed: ");
		String ch=sc.next();
		String output=str.replace(ch,"");
		System.out.println(output);
		sc.close();
	}

}
