package corejava8;
import java.util.Scanner;
public class Traffic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		char ch='y';
		do {
			System.out.println("Red?");
			System.out.println("Yellow?");
			System.out.println("Green?");
			String choice=sc.next().toLowerCase();
			switch(choice){
			case "red":
				System.out.println("stop");
				break;
			case "yellow":
				System.out.println("ready");
				break;
			case "green":
				System.out.println("go");
				break;
			default:
				System.out.println("Wrong Choice!");
			}
			System.out.println("Want to continue? y/n");
			ch=sc.next().charAt(0);
		}while(ch=='y');
		sc.close();
	}

}
