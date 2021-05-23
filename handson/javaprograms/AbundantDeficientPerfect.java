
public class AbundantDeficientPerfect {
	static int checkSumDivisor(int num) {
		int sum=0;
		for(int i=1;i<num;i++) {
			if(num%i==0) {
				sum+=i;
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		int d=0,a=0,p=0;

		for(int i=1;i<=10000;i++) {
		int sum=checkSumDivisor(i);
		if(sum>i) {
			a++;
		}
		else if(sum==i) {
			p++;
		}
		else{
			d++;
		}
		}
		System.out.println("Deficient Numbers: "+d);
		System.out.println("Perfect Numbers: "+p);
		System.out.println("Abundant Numbers: "+a);
	}
}
