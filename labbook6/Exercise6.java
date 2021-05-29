package labbook6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/*Create a method which accepts the id and the age of people as a Map 
and decide if they are eligible for vote.
A person is eligible for vote if his age is greater than 18.
Add the IDs of all the eligible persons to list and return the list. */
public class Exercise6 {
	public static List<Long> votersList(Map<Long,Integer> hm){
		List<Long> list=new ArrayList<>();
		for(Map.Entry<Long, Integer> i:hm.entrySet()) {
			if(i.getValue()>18)
				list.add(i.getKey());
		}
		return list;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long id;
		int age;
		Map<Long,Integer> hm=new HashMap<>();
		System.out.println("Enter the ids and the ages: ");
		char ch='y';
		do {
			System.out.println("Enter the id: ");
			id=sc.nextLong();
			System.out.println("Enter the age: ");
			age=sc.nextInt();
			hm.put(id, age);
			System.out.println("Continue?? y/n");
			ch=sc.next().charAt(0);
			
		}while(ch=='y');
		System.out.println("The ids of people who are eligible to vote: "+votersList(hm));
		sc.close();
	}
}
