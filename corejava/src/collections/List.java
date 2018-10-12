package collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.TreeSet;


	// Student Class
	 
	class Student
	{
	    int id;
	 
	    String name;
	 
	    int perc_Of_Marks_Obtained;
	 
	    public Student(int id, String name, int perc_Of_Marks_Obtained)
	    {
	        this.id = id;
	 
	        this.name = name;
	 
	        this.perc_Of_Marks_Obtained = perc_Of_Marks_Obtained;
	    }
	 
	    @Override
	    public String toString()
	    {
	        return id+" : "+name+" : "+perc_Of_Marks_Obtained;
	    }
	}
	 
	//MyComparator Class
	 
	class MyComparator implements Comparator<Student>
	{
	    @Override
	    public int compare(Student s1, Student s2)
	    {
	        if(s1.id == s2.id)
	        {
	            return 0;
	        }
	        else
	        {
	            return s2.perc_Of_Marks_Obtained - s1.perc_Of_Marks_Obtained;
	        }
	    }
	}
	 
	//MainClass
	 
	public class List
	{
	    public static void main(String[] args)
	    {
	        //Instantiating MyComparator
	 
	        MyComparator comparator = new MyComparator();
	 
	        //Creating TreeSet with 'MyComparator' as Comparator.
	 
	        TreeSet<Student> set = new TreeSet<Student>(comparator);
	 
	        //Adding elements to TreeSet
	 
	        set.add(new Student(121, "Santosh", 85));
	 
	        set.add(new Student(231, "Cherry", 85));
	 
	        set.add(new Student(417, "David", 85));
	 
	        set.add(new Student(562, "Praveen", 85));
	 
	        set.add(new Student(231, "Raj", 85));         //Duplicate element
	 
	        set.add(new Student(458, "John", 85));
	 
	        set.add(new Student(874, "Peter", 85));
	 
	        set.add(new Student(231, "Hari", 85));       //Duplicate element
	 
	        set.add(new Student(568, "Daniel", 89));
	 
	        //Iterating though TreeSet
	 
	        Iterator<Student> it = set.iterator();
	 
	        while (it.hasNext())
	        {
	            System.out.println(it.next());
	        }
	    }
	}


