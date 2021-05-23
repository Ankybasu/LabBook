package javaprograms;

	import java.util.Scanner;
	import java.util.ArrayList;
	import java.util.List;
	public class DuplicateCharacters {
		static void checkDuplicates(String str){
			List<Character> duplicates=new ArrayList<Character>();
			boolean flag=false;
			char s;
			int count;
			for(int i=0;i<str.length();i++) {
				count=0;
				s=str.charAt(i);
				for(int j=0;j<str.length();j++) {
					if(i!=j&&s==str.charAt(j)) {
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
				System.out.println("No duplicated character present");
			}
			else {
				System.out.println(duplicates.toString().substring(1,3*duplicates.size()-1));
			}
			
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			String str=sc.next();
			checkDuplicates(str);
			sc.close();

		}

	}

