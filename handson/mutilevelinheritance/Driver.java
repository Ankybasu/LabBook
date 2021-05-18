package mutilevelinheritance;

import java.util.Scanner;
public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Circle ob1=new Circle();
		Rectangle ob2=new Rectangle();
		Square ob3=new Square();
		String color;
		 boolean filled;
		double radius,width,length,side;
		char c='y';
		do {
		System.out.println("Enter choice:\n: 1 to enter Circle Details\n"
										+": 2 to enter Rectangle Details\n"+
										": 3 to display Square Details");
		int ch=sc.nextInt();
		if(ch==1) {
			System.out.println("Enter color: ");
			sc.nextLine();
			color=sc.nextLine();
			System.out.println("Enter filled or not: ");
			filled=sc.nextBoolean();
			System.out.println("Enter radius: ");
			radius=sc.nextDouble();
			ob1.setColor(color);
			ob1.setFilled(filled);
			ob1.setRadius(radius);
			System.out.println("area: "+ob1.getArea());
			System.out.println("Perimeter: "+ob1.getPerimeter());
			System.out.println(ob1);
		}
		if(ch==2) {
			System.out.println("Enter color: ");
			sc.nextLine();
			color=sc.nextLine();
			System.out.println("Enter filled or not: ");
			filled=sc.nextBoolean();
			System.out.println("Enter width: ");
			width=sc.nextDouble();
			System.out.println("Enter length: ");
			length=sc.nextDouble();
			ob2.setColor(color);
			ob2.setFilled(filled);
			ob2.setWidth(width);
			ob2.setLength(length);
			System.out.println("Perimeter : "+ob2.getPerimeter());
			System.out.println("area: "+ob2.getArea());
			ob2.getWidth();
			System.out.println(ob2);
		}
		if(ch==3) {
			System.out.println("Enter color: ");
			sc.nextLine();
			color=sc.nextLine();
			System.out.println("Enter filled or not: ");
			filled=sc.nextBoolean();
			System.out.println("Enter side: ");
			side=sc.nextDouble();
			ob3.setSide(side);
			ob3.setColor(color);
			ob3.setFilled(filled);
			ob3.setWidth(side);
			ob3.setLength(side);
			System.out.println("Perimeter: "+ob3.getPerimeter());
			System.out.println("Area: "+ob3.getArea());
			ob3.getWidth();
			System.out.println(ob3);
		}
		System.out.println("Enter y/n?");
		 c=sc.next().charAt(0);
		}while(c=='y');
		sc.close();
	}

}
