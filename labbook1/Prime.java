package corejava8;
import java.util.Scanner;
public class Prime {
	static boolean checkPrime(int num) {
		if(num<=1)
			return false;
		if(num==2)
			return true;
		if(num%2==0)
			return false;
		for(int j=3;j<=Math.sqrt(num);j+=2) {
			if(num%j==0)
				return false;
		}
			return true;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value:");
		int n=sc.nextInt();
		System.out.println("The prime numbers are: ");
		for(int i=1;i<=n;i++) {
			if(checkPrime(i)) {
				System.out.println(i);
			}
			}
		sc.close();
	}
}
