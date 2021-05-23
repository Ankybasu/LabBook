package controlstatements;
import java.util.Scanner;
public class Swap {
	static void swap(int x, int y, int[] arr) {
	    int temp = arr[x];
	    arr[x] = arr[y];
	    arr[y] = temp;
	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	    int n = sc.nextInt();
	    int a[] = new int[n];
	    for(int i=0; i < n; i++)
	        a[i] = sc.nextInt();
	    for(int i=0; i < n/2; i++)
	        swap(i,n-i-1,a);
	    for(int i = 0; i < n; i++)
	        System.out.println(a[i]);
	    sc.close();
	    }
	}
