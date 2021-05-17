package labbook3;

import java.util.Scanner;

public class Exercise3 {
	public static String alterString(String str) {
		StringBuffer br=new StringBuffer();
		int len=str.length();
		for(int i=0;i<len;i++) {
			char ch=str.charAt(i);
			if((ch>='a'&& ch<='z')||(ch>='A'&& ch<='Z')) {
				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||
				   ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
					br.append(ch);
					continue;
				}
				if(ch=='z'||ch=='Z') {
					br.append('a');
					continue;
				}
				char next=(char)((int)ch+1);
				br.append(next);
			}
		}
		return br.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string: ");
		String output=alterString(sc.next());
		System.out.println(output);
		sc.close();
	}

}
