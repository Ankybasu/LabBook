package corejava8;
import java.util.Scanner;
public class SumCubes {
	static int calculateSum(int num) {
		int d,sum=0;
		while(num>0) {
			d=num%10;
			sum+=(d*d*d);
			System.out.println(sum);
			num=num/10;
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value:");
		int num=sc.nextInt();
		System.out.println("Sum of Cubes: "+calculateSum(num));
		sc.close();

	}

}
