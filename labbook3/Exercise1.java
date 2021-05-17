package labbook3;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers: ");
		String input=sc.nextLine();
		StringTokenizer s=new StringTokenizer(input," ");
		int sum=0;
		while(s.hasMoreTokens()) {
			int num=Integer.parseInt(s.nextToken());
			System.out.println("Integer is: "+num);
			sum+=num;
		}
		System.out.println("Sum is: "+sum );
		sc.close();
	}

}
