package single;

import java.text.ParseException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws ParseException {
		Scanner sc=new Scanner(System.in);
		Employee e=new Employee();
		e.setName(sc.next());
		e.setId(sc.nextInt());
		e.setDob(sc.next());
		e.setDoj(sc.next());
		System.out.println(e);
		sc.close();
	}

}
