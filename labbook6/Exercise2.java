package labbook6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercise2 {
//Collection: Create a method that accepts a character array and count the number of times each character is present in the array.
	public static Map<Character, Integer> countChars(char[] arr){
		 Map<Character, Integer> hm=new HashMap<>();
		int count;
		for(int i=0;i<arr.length;i++) {
			count=1;
			for(int j=0;j<arr.length;j++) {
				if(i!=j&&arr[i]==arr[j]) {
					count++;
				}
			}
				hm.put(arr[i],count);
		}
		
		return hm;
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str=sc.nextLine();
		char[] arr=str.toCharArray();
		Map<Character,Integer> hm=countChars(arr);
		System.out.println(hm);
		sc.close();
	}

}
