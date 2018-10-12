package collections;

import java.util.ArrayList;

public class ArrayToArrayList {
	public static void main(String[] args) {
		//conversion from array to string
		String[] arr= {"a","b","c","d"};
		
		ArrayList al=new ArrayList();
		for(String a: arr)
		{al.add(a);}
		System.out.println(al); // printing arraylist 
		al.add("e");// added two more element to arraylist
		al.add("f");
		
		System.out.println(al);//updated arraylist 
		
		//now converting updated arraylist to array; 
		//downcasting because list element are of Object type
		String[] arr1= new String [al.size()];
		for (int i=0;i<=al.size()-1;i++)
	{
		arr1[i]= (String)al.get(i);
		System.out.println(arr1[i]);}	
		}
	}


