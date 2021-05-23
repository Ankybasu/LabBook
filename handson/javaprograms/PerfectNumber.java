import java.util.Scanner;
public class PerfectNumber {
	static boolean checkPerfect(int num) {
		int sum=0;
		for(int i=1;i<num;i++) {
			if(num%i==0) {
				sum+=i;
			}
		}
		if(sum==num) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		if(checkPerfect(Integer.parseInt(sc.next()))) {
			System.out.println("Perfect Number");
		}
		else {
			System.out.println("Not a perfect number");
		}
		sc.close();
	}
}
