
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
public class FailSafe {
	public static void main(String[] args) {
		Map<Integer,String> names = new HashMap<Integer,String>();//failfast
		//ConcurrentHashMap<Integer,String> names = new ConcurrentHashMap<Integer,String>();//failsafe
		names.put(1,"Rama");
		names.put(2,"Rama1");
		names.put(3,"Ramji");
		names.put(4,"Ram");
		names.put(5,"Raamaa");
		try {
			//printing the values of the ArrayList
			System.out.println("Names in the ArrayList : ");
			Iterator<String> itr = names.values().iterator();
			while(itr.hasNext()) {
				System.out.println(itr.next());
				System.out.println("adding an element in between the iteration");
				names.put(6,"Krishna");
			}
		}catch(Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}finally {
			System.out.println("finally block");
		}
	}
	
}