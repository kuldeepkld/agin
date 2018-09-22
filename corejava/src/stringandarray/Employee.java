package stringandarray;

import java.util.Iterator;
import java.util.TreeSet;

public class Employee implements Comparable {

	int id;
	String name;
	double exp;
	Employee(int id, String name, double exp)
	{
		this.id=id;
		this.name=name;
		this.exp=exp;
	}	
	
	//public int hashCode() {
		//.out.println("a4");
		//return this.id;
	//}
	public String toString() {
		System.out.println("a6");
		return " "+name;
	} 
	

	public int compareTo(Object o) {
	Employee emp= (Employee)o;
	System.out.println("a5");
		return this.id-emp.id;
	}
	
	
}