package corejava8;
import java.util.Scanner;
public class Exercise7{
	static boolean checkNumber(int n) {
		int lastDigit=n%10;
		n/=10;
		int previousDigit;
		while(n>0) {
			previousDigit=n%10;
			if(previousDigit<lastDigit) {
				n=n/10;
				lastDigit=previousDigit;
			}
			else {
				return false;
			}
		}
			return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		if(checkNumber(n)) {
			System.out.println(n+" is an increasing number.");
		}
		else {
			System.out.println("Not an increasing number.");
		}
		sc.close();

	}

}
