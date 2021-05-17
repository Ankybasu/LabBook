package corejava8;
import java.util.Scanner;
public class Exercise6 {
	static int calculateDifference(int n) {
		int sum1=0,sum2=0,sum=0;
		for(int i=1;i<=n;i++) {
			sum1+=Math.pow(i, 2);
			sum2+=i;
		}
		sum2=(int)Math.pow(sum2,2);
		sum=sum1-sum2;
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the nth value:");
		int n=sc.nextInt();
		System.out.println(calculateDifference(n));
		sc.close();

	}

}
