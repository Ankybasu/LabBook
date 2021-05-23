import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class DuplicatedNumber {
	static void checkDuplicates(String num){
		List<Character> duplicates=new ArrayList<Character>();
		boolean flag=false;
		char s;
		int count;
		for(int i=0;i<num.length();i++) {
			count=0;
			s=num.charAt(i);
			for(int j=0;j<num.length();j++) {
				if(i!=j&&s==num.charAt(j)) {
					flag=true;
					count++;
					break;
				}
			}
			if(count>0 && duplicates.contains(s)==false) {
				duplicates.add(s);
			}
		}
		if(flag==false) {
			System.out.println("No duplicated number present");
		}
		else {
			System.out.println(duplicates.toString().substring(1,3*duplicates.size()-1));
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String num=sc.next();
		checkDuplicates(num);
		sc.close();

	}

}
