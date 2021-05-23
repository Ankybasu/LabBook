package controlstatements;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Merge {
	static Integer[] merge(int arr1[],int arr2[],int size1,int size2) {
		int size=size1+size2;
		Integer arr3[]=new Integer[size];
		List<Integer> l1=new ArrayList<Integer>();
		List<Integer> l2=new ArrayList<Integer>();
		List<Integer> l3=new ArrayList<Integer>();
		for(int i=0;i<size1;i++) {
			l1.add(arr1[i]);
		}
		for(int i=0;i<size2;i++) {
			l2.add(arr2[i]);
		}
		l3.addAll(l1);
		l3.addAll(l2);
		arr3=l3.toArray(arr3);
		return arr3;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of first array:");
		int size1=sc.nextInt();
		int arr1[]=new int[size1];
		System.out.println("Enter the elements:");
		for(int i=0;i<size1;i++) {
			arr1[i]=sc.nextInt();
		}
		System.out.println("enter the size of second array");
		int size2=sc.nextInt();
		int arr2[]=new int[size2];
		System.out.println("Enter the elements:");
		for(int i=0;i<size2;i++) {
			arr2[i]=sc.nextInt();
		}
		Integer a1[]=merge(arr1,arr2,size1,size2);
		for(Integer i:a1) {
			System.out.println(i);
		}
		sc.close();
		
	}

}
