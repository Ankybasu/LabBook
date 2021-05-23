package arithmeticoperations;
import java.util.Scanner;
public class Circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		 double PI=3.14;
		System.out.println("Enter radius:");
		double r=sc.nextDouble();
		System.out.println("Perimeter is: "+(2*PI*r));
		System.out.println("Area is: "+(PI*r*r));
		sc.close();
	}

}
