package passing_casting;

public class check {
public static void main(String[] args) {
	Demo8 ref= new Demo8();
	System.out.println(ref);
	ref.test(ref);
	
}
}
class Demo8{
	void test(Demo8 ref)
	{
		System.out.println(ref);}
	}