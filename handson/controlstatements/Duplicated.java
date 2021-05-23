package controlstatements;
import java.util.Scanner;
public class Duplicated{
	static void checkDuplicates(char[] arr){
		int count;
        for(int i = 0; i <arr.length; i++) {  
            count = 1;  
            for(int j = i+1; j <arr.length; j++) {  
                if(arr[i] == arr[j]) {  
                    count++;    
                    arr[j] = '0';  
                }  
            }   
            if(count > 1 && arr[i] != '0')  
                System.out.println(arr[i]);  
        }
	}
      static void checkDuplicatesDigits(int[] arr) {
          for(int i = 0; i < arr.length; i++) {  
              for(int j = i + 1; j < arr.length; j++) {  
                  if(arr[i] == arr[j])  
                      System.out.println(arr[j]);  
              }  
          }
      }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1 for Character Duplicates\nEnter 2 for Integer Duplicates:");
		int ch=sc.nextInt();
		if(ch==1) {
		System.out.println("Enter the string: ");
		String a=sc.next();
		char[] c=a.toCharArray();
		checkDuplicates(c);
		}
		else if(ch==2) {
		System.out.println("Enter the size of the array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the numbers:");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		checkDuplicatesDigits(arr);
		}
		else {
			System.exit(0);
		}
		sc.close();

	}

}

