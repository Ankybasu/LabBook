package corejava8;
import java.util.Scanner;
public class Exercise8{
	static boolean checkNumber(int n) {
		if(n==1)
			return true;
		if(n==0||n%2!=0)
			return false;
		return checkNumber(n/2);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		if(checkNumber(n)) {
			System.out.println(n+" is a power of 2");
		}
		else {
			System.out.println("Not a power of 2");
		}
		sc.close();

	}

}
