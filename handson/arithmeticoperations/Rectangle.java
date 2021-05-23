package arithmeticoperations;
import java.util.Scanner;
public class Rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length:");
		double l=sc.nextDouble();
		System.out.println("Enter breadth:");
		double b=sc.nextDouble();
		System.out.println("Perimeter is: "+(2*(l+b)));
		System.out.println("Area is: "+(l*b));
		sc.close();
	}

}
