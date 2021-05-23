import java.util.Scanner;
public class DisariumNumber {
	static boolean checkDisarium(int num) {
		int n=num;
		int temp=num;
		int l=0,sum=0,d;
		while(temp!=0) {
			temp=temp/10;
			l++;
			}
	while(num>0) {
		d=num%10;
		sum+=(int)Math.pow(d,l);  
		num=num/10;
		l--;
		}
		if(sum==n) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		if(checkDisarium(Integer.parseInt(sc.next()))){
			System.out.println("Disarium Number");
		}
		else {
			System.out.println("Not a Disarium Number");
		}
		sc.close();

	}
}
