package controlstatements;
import java.util.Scanner;
public class Arr1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[10];
		for(int i=0;i<10;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<10;i++) {
			if(arr[i]==0) {
				System.out.println("0");
				continue;
			}
			System.out.println(arr[i]);
		}
		System.out.println("");
		for(int j=0;j<10;j++) {
			if(arr[j]==0) {
				break;
			}
			System.out.println(arr[j]);
		}
		sc.close();
	}
}
