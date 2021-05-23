
public class Kaprekar {
	static boolean checkKaprekar(int num) {
		if(num==1) {
			return true;
		}
		int sq=0,temp=0;
		sq=num*num;
		temp=sq;
		int sum=0;
	      int countDigits = 0;
	      int firstPart = 0;
	      int secondPart = 0;
	      while(temp!=0) {
	         countDigits++;
	         temp /= 10; 
	      }

	      for(int i=countDigits-1; i>0; i--) {
	         firstPart = sq / (int)Math.pow(10, i);
	         secondPart = sq % (int)Math.pow(10, i);
	         if(firstPart == 0 || secondPart == 0)
	         	continue;
	         sum = firstPart + secondPart;
	         if( sum == num)
	         return true;
	      }
	      return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		for(int i=1;i<=1000;i++) {
		if(checkKaprekar(i)){
			count++;
		}
		}
		System.out.println(count);
	}
}
