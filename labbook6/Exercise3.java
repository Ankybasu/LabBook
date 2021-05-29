package labbook6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercise3 {
	//Create a method which accepts an array of numbers and returns the numbers and their squares in Hashmap
	public static Map<Integer,Integer> getSquares(int[] arr){
		Map<Integer,Integer> hm=new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			hm.put(arr[i],(int) Math.pow(arr[i],2));
		}
		return hm;	
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Map<Integer,Integer> output=new HashMap<>();
		System.out.println("Enter the values: ");
		String[] arr=sc.nextLine().split(" ");
		int[] a=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			a[i]=Integer.parseInt(arr[i]);
		}
		output=getSquares(a);
		for(Map.Entry<Integer,Integer> i:output.entrySet()) {
			System.out.println(i);
		}
		sc.close();
	}
}
