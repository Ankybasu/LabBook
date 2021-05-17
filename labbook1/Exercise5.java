package corejava8;
import java.util.Scanner;
public class Exercise5 {
	static int calculateSum(int num) {
		int sum=0;
		for(int i=1;i<=num;i++) {
			if(i%3==0||i%5==0)
				sum+=i;
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the nth value:");
		int n=sc.nextInt();
		System.out.println(calculateSum(n));
		sc.close();
		
	}

}
