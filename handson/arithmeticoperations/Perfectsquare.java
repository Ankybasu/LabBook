package arithmeticoperations;
import java.util.Scanner;
public class Perfectsquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int sq=(int)Math.sqrt(num);
		if(sq*sq==num) {
			System.out.println("Perfect Square");
		}
		else {
			System.out.println("Not a perfect square!");
		}
		sc.close();

	}

}
