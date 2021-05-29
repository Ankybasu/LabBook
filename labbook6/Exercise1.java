package labbook6;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Exercise1 {
	//Create a method which accepts a hash map and return the values of the map in sorted order as a List.
	public static  List<Map.Entry<Integer,String> > getValues(HashMap<Integer,String> hm){
        List<Map.Entry<Integer,String> > list =
                new LinkedList<Map.Entry<Integer,String> >(hm.entrySet());
  
         // Sort the list in ascending order
         Collections.sort(list, new Comparator<Map.Entry<Integer,String> >() {
             public int compare(Map.Entry<Integer,String> o1,
                                Map.Entry<Integer,String> o2)
             {
                 return (o1.getValue()).compareTo(o2.getValue());
             }
         });
		return list;

}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	HashMap<Integer,String> hm=new HashMap<>();
	int count;
	System.out.println("Enter the no. of values to enter : ");
	count=sc.nextInt();
	for(int i=1;i<=count;i++) {
		System.out.println("Enter the string: ");
		String str=sc.next();
		hm.put(i,str);
	}
	 List<Map.Entry<Integer,String> > output=getValues(hm);
	System.out.println(output);
	sc.close();
}
}

