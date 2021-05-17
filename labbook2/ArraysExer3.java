package corejava8;
import java.util.Arrays;
import java.util.Scanner;
public class ArraysExer3 {
	static int[] getSorted(int [] arr) {
		StringBuffer br=new StringBuffer();
		for(int i: arr) {
			br.append(i);
			br.append(" ");
		}
		br.reverse();
		String a1=br.toString();
		String[] a=a1.trim().split(" ");
		Arrays.sort(a);
		int[] narr=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			narr[i]=Integer.parseInt(a[i]);
		}
		return narr;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the integers");
		String a[]=sc.nextLine().split(" ");
		int arr[]=new int[a.length];
		for(int i=0;i<a.length;i++) {
			arr[i]=Integer.parseInt(a[i]);
		}
		System.out.println(Arrays.toString(getSorted(arr)));
		sc.close();
	}
}
