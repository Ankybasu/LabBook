package javaprograms;
import java.util.Scanner;
public class Upper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str=sc.next();
		StringBuffer brf=new StringBuffer();
		StringBuffer bre=new StringBuffer();
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch>='A'&&ch<='Z') {
				brf.append(ch);
			}
			else {
			bre.append(ch);
			}
		}
		System.out.println(brf.toString()+bre.toString());
		sc.close();
	}

}
