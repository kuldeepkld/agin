package stringandarray;

import java.util.Iterator;
import java.util.TreeSet;

public class mainclass {
	
		public static void main(String[] args) {
			TreeSet set= new TreeSet();
			System.out.println("a1");
			set.add(new Employee(10,"rama", 50.00));
			System.out.println("a2");
			set.add(new Employee(20,"sama", 30.00));
			set.add(new Employee(30,"mama", 30.00));
			System.out.println("a2");
			set.add(new Employee(40,"kama", 30.00));
			set.add(new Employee(50,"pama", 10.00));
			set.add(new Employee(1,"kullu",2.00));
			//for(Object obj: set)
				//System.out.println(obj);
			
			Iterator i= set.iterator();
			while(i.hasNext())
			System.out.println(i.next());
		}
	}



