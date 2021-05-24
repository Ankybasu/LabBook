package inheritance;
import java.util.Scanner;
public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String name,add,prog,school;
		int year;
		Double fee,pay;
		Student ob1=new Student();
		Staff ob2=new Staff();
		char c='y';
		do {
		System.out.println("Enter choice:\n: 1 to enter Student Details\n"
										+": 2 to enter Staff Details\n"+
										": 3 to display Student Details\n"+
										": 4 to display Staff Details");
		int ch=sc.nextInt();
		if(ch==1) {
			System.out.println("Enter name: ");
			sc.nextLine();
			name=sc.nextLine();
			System.out.println("Enter address: ");
			add=sc.nextLine();
			sc.nextLine();
			System.out.println("Enter program: ");
			prog=sc.nextLine();
			System.out.println("Enter year: ");
			year=sc.nextInt();
			System.out.println("Enter fee: ");
			fee=sc.nextDouble();
			ob1.setName(name);
			ob1.setAddress(add);
			ob1.setProgram(prog);
			ob1.setYear(year);
			ob1.setFee(fee);
		}
		if(ch==2) {
			System.out.println("Enter name: ");
			sc.nextLine();
			name=sc.nextLine();
			System.out.println("Enter address: ");
			sc.nextLine();
			add=sc.nextLine();
			System.out.println("Enter school: ");
			school=sc.nextLine();
			System.out.println("Enter pay: ");
			pay=sc.nextDouble();
			ob2.setName(name);
			ob2.setAddress(add);
			ob2.setSchool(school);
			ob2.setPay(pay);

		}
		if(ch==3) {
			System.out.println(ob1);
		}
		if(ch==4) {
			System.out.println(ob2);
		}
		System.out.println("Enter y/n?");
		 c=sc.next().charAt(0);
		}while(c=='y');
		sc.close();
	}

}
