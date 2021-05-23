package controlstatements;

import java.util.Scanner;

public class ArrayChoice {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char arr[]=new char[10];
		char ch='y';
		do {
			System.out.println("1 for entering values");
			System.out.println("2 to Find the vowels");
			System.out.println("3 to Find the consonants");
			System.out.println("4 to Find the symbols");
			System.out.println("Enter your choice");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				for(int i=0;i<arr.length;i++) {
					arr[i]=sc.next().charAt(0);
				}
				break;
			case 2:
				System.out.println("Vowels: ");
				for(int i=0;i<arr.length;i++) {
					if(arr[i]=='a'||arr[i]=='A'||arr[i]=='e'||arr[i]=='E'||arr[i]=='i'||arr[i]=='I'||
							arr[i]=='o'||arr[i]=='O'||arr[i]=='u'||arr[i]=='U') {
						System.out.println(arr[i]);
						
					}
				}
				break;
			case 3:
				System.out.println("Consonants:");
				for(int i=0;i<arr.length;i++) {
					if((arr[i]>='a'&&arr[i]<='z')||(arr[i]>='A'&&arr[i]<='Z')){
						System.out.println(arr[i]);
					}
				}
				break;
			case 4:
				System.out.println("Symbols");
				for(int i=0;i<arr.length;i++) {
					if(!(arr[i]>='0'&&arr[i]<='9')&&!((arr[i]>='a'&&arr[i]<='z')||(arr[i]>='A'&&arr[i]<='Z'))){
						System.out.println(arr[i]);
					}
				}
				break;
			default:
				System.out.println("Invalid input!");
				
			}
			System.out.println("want to continue? y/n");
			ch=sc.next().charAt(0);
			
		}while(ch=='y');
		sc.close();
	}

}
