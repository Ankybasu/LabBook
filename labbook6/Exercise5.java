package labbook6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

//Create a method which accepts an array of integer elements and return the second smallest element in the array 
public class Exercise5 {
	public static int getSecondSmallest(int[] arr) {
		List<Integer> list=new ArrayList<>();
		for(int i=0;i<arr.length;i++) {
			list.add(arr[i]);
		}
		Collections.sort(list);
		return list.get(1);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers: ");
		String[] a=sc.nextLine().split(" ");
		int arr[] =new int[a.length];
		for(int i=0;i<a.length;i++) {
			arr[i]=Integer.parseInt(a[i]);
		}
		System.out.println("The second smallest integer is : "+getSecondSmallest(arr));
		sc.close();
	}
}
