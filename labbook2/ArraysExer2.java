package corejava8;
import java.util.Arrays;
import java.util.Scanner;
public class ArraysExer2 {
	static String sortStrings(String[] arr) {
		StringBuilder a=new StringBuilder();
		int size=arr.length;
		int mid=(size/2);
		if(size%2!=0)
			mid=(size/2)+1;
	for(int i=0;i<mid;i++) {
		a.append(arr[i].toUpperCase());
		a.append(" ");
	}
	for(int i=mid;i<size;i++) {
		a.append(arr[i].toLowerCase());
		a.append(" ");
	}
	return a.toString();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String[] a=sc.nextLine().split(" ");
		Arrays.sort(a);
		System.out.println(sortStrings(a));
		sc.close();
	}

}
