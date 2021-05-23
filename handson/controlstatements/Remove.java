package controlstatements;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Remove {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of first array:");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the elements:");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the index to be removed:");
		int index=sc.nextInt();
		List<Integer> l=new ArrayList<Integer>();
		for(int i=0;i<size;i++) {
			l.add(arr[i]);
		}
		l.remove(index);
		System.out.println(l);
		sc.close();
	}

}
