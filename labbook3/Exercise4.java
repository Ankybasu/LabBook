package labbook3;

import java.util.Scanner;

public class Exercise4 {
	public static int modifyNumber(int number1) {
		StringBuffer br=new StringBuffer();
		String num=String.valueOf(number1);
		for(int i=0;i<num.length()-1;i++) {
			int f1=Integer.parseInt(String.valueOf(num.charAt(i)));
			int f2=Integer.parseInt(String.valueOf(num.charAt(i+1)));
			int diff=Math.abs(f2-f1);
			br.append(diff);
		}
		br.append(num.charAt(num.length()-1));
		return Integer.parseInt(br.toString());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string: ");
		int output=modifyNumber(Integer.parseInt(sc.next()));
		System.out.println(output);
		sc.close();
	}

}
