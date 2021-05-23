package arithmeticoperations;
import java.util.Scanner;
public class Inches {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		double inch;
		System.out.println("Enter the value in inches");
		inch=sc.nextDouble();
		System.out.println("In meters it is: "+(inch*0.0254));
		sc.close();

	}

}
