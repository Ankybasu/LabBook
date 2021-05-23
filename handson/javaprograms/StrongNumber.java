import java.util.Scanner;
public class StrongNumber {
	static boolean checkStrong(int num) {
		int temp=num;
		int f,fact,sum=0;
		while(num>0) {
			fact=1;
			f=num%10;
			for(int i=1;i<=f;i++) {
				fact*=i;
			}
			num=num/10;
			sum+=fact;
		}
		if(sum==temp) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		if(checkStrong(Integer.parseInt(sc.next()))){
			System.out.println("Strong Number");
		}
		else {
			System.out.println("Not a Strong NUmber");
		}
		sc.close();

	}

}
