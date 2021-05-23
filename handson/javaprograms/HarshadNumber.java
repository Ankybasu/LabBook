import java.util.Scanner;

public class HarshadNumber {
	static boolean checkHarshad(int num) {
		int temp=num;
		int d,sum=0;
		while(temp>0) {
			d=temp%10;
			sum+=d;
			temp=temp/10;
		}
		if(num%sum==0) {
			return true;
		}
		return false;
		
	}
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	if(checkHarshad(Integer.parseInt(sc.next()))){
		System.out.println("Harshad Number");
	}
	else {
		System.out.println("Not a Harshad Number");
	}
	sc.close();
	}
}
