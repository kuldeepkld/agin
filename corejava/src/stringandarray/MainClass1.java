package stringandarray;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class MainClass1 {

	public static void main(String[] args) {
		TreeSet set= new TreeSet(new SortById());
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
class SortById implements Comparator
{
	
	public int compare(Object a1, Object a2) {
		System.out.println("a7");
		Employee emp1= (Employee)a1;
		Employee emp2= (Employee)a2;
		return (emp1.name).compareTo(emp2.name);
	}
	
}

//TreeSet with default constructor will sort the element in natural ascending order, 
//but if you want some custom sorting according to your requirement then 
//you should go for the Comparator interface.
//eq This is your default class Employee and you want to sort this class according to salary then.
