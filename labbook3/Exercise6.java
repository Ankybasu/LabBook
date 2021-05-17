package labbook3;
import java.util.Scanner;
public class Exercise6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		input.toLowerCase();
		boolean flag=true;
		for(int i=0;i<input.length()-1;i++) {
			String b=String.valueOf(input.charAt(i));
			String l=String.valueOf(input.charAt(i+1));
			if(b.compareTo(l)<=-1)
				continue;
			else {
				flag=false;
				break;
			}
		}
		if(flag==true)
			System.out.println("Positive String");
		else
			System.out.println("Not a positive string!");
		sc.close();

	}

}
