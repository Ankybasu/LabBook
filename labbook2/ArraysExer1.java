package corejava8;
import java.util.Scanner;
import java.util.Arrays;

public class ArraysExer1 {
	static int getSecondSmallest(int[] arr) {
		Arrays.sort(arr);
		return(arr[1]);
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int size=sc.nextInt();
		System.out.println("Enter the values of the array:");
		int arr[]=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("The second smallest element is: "+getSecondSmallest(arr));
		sc.close();
	}

}
