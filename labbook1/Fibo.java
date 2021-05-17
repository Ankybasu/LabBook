package corejava8;
import java.util.Scanner;
public class Fibo {
	static int n1=1,n2=1,k=3;
	static int fibo(int n1,int n2,int count) {
		int n3=n1+n2;
		if(k==count)
			return n3;
		k++;
		return fibo(n2,n3,count);
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the nth value place: ");
		int n=sc.nextInt();
		System.out.println("R for recursive\n N for non-recursive:");
		char ch=sc.next().charAt(0);
		if(ch=='R') {
		System.out.println(fibo(n1,n2,n));
		}
		else if(ch=='N')
		{
			int n3=0;
			do{
				if(k==n)
					break;
				n3=n1+n2;
				n1=n2;
				n2=n3;
				k++;
			}while(k<n);
			System.out.println(n3);
		}
		else {
			System.out.println("Invalid input!");
		}
		sc.close();

	}

}
