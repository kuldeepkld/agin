package stringandarray;



public class StringCheck {
	int id;
	String name;
	StringCheck(int a, String b)
	{
		id=a;
		name=b;
	}

	public String toString() {
	return "Name: "+name +" ID: "+id;
	}
	
//	public boolean equals(Object aa) {
//		StringCheck st= (StringCheck)aa;
//		return id==st.id;
//	}

public static void main(String[] args) {
	
	StringCheck s= new StringCheck( 12,"kullu");
	System.out.println(s);
	
	StringCheck y= new StringCheck( 12,"kull");
	System.out.println(y);
	
	System.out.println(s.equals(y));
	
}
}