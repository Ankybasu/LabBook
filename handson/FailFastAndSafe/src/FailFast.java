		import java.util.ArrayList;
		import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
public class FailFast {
			public static void main(String[] args) {
				//ArrayList<String> names = new ArrayList<String>();//failfast
				CopyOnWriteArrayList<String> names = new CopyOnWriteArrayList<String>();//failsafe
				names.add("Rama");
				names.add("Rama1");
				names.add("Ramji");
				names.add("Ram");
				names.add("Raamaa");
				try {
					//printing the values of the ArrayList
					System.out.println("Names in the ArrayList : ");
					Iterator<String> itr = names.iterator();
					while(itr.hasNext()) {
						System.out.println(itr.next());
						System.out.println("adding an element in between the iteration");
						names.add("Krishna");
					}
				}catch(Exception e) {
					System.out.println(e);
					e.printStackTrace();
				}finally {
					System.out.println("finally block");
				}
			}
			
		}
