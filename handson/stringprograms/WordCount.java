package javaprograms;
import java.util.Scanner;
class WordCount
{
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String[] str=sc.nextLine().split(" ");
		
		// Print the result
		System.out.println("No of words : " +
		str.length);
		sc.close();
	}
}
