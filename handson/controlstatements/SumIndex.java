package controlstatements;

import java.util.Scanner;

public class SumIndex {
	static void sum(int[] arr) {
		int sumOdd=0,sumEven=0;
		for(int i=0;i<arr.length;i++) {
			if(i%2==0) {
				sumEven+=arr[i];
			}
			else {
				sumOdd+=arr[i];
			}
		}
		System.out.println("Sum of elements at odd index: "+sumOdd);
		System.out.println("Sum of elements at even index: "+sumEven);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the numbers:");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		sum(arr);
		sc.close();

	}

}
