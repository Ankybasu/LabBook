package labbook3;
import java.util.Scanner;
public class Exercise2 {
	public static String getImage(String a) {
		StringBuffer br=new StringBuffer();
		br.append(a);
		br.reverse();
		return a+"|"+br.toString();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string: ");
		String output=getImage(sc.next());
		System.out.println(output);
		sc.close();
	}

}
