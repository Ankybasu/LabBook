package labbook6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Exercise4 {
	/*
	 * The input Hashmap contains the student registration number as key and mark as
	 * value.
	 * 
	 * The output Hashmap should contain the student registration number as key and
	 * the medal type
	 */
	public static Map<Long,String> getStudents(Map<Long,Integer> hm){
		Map<Long,String> output=new HashMap<>();
		for(Map.Entry<Long, Integer> i: hm.entrySet()) {
			int marks=i.getValue();
			long id=i.getKey();
			
			if(marks>=90)
				output.put(id,"Gold"); 

			if(marks>=80 && marks< 90)
				output.put(id,"Silver");
			
			if(marks>=70 && marks< 80)
				output.put(id,"Bronze");
			
		}
		return output;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Map<Long,Integer> hm=new HashMap<>();
		System.out.println("Enter the no of students: ");
		int num=sc.nextInt();
		int count=0;
		while(count<num) {
		System.out.println("Enter registration number: ");
		long id=sc.nextLong();
		System.out.println("Enter marks: ");
		int marks=sc.nextInt();
		hm.put(id, marks);
		count++;
		}
		System.out.println(getStudents(hm));
		sc.close();
		
		
	}
}