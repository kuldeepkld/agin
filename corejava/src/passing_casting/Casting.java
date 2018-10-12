package passing_casting;

public class Casting {
	public static void main(String[] args) {

		Demo1 ref=new Demo4();
		System.out.println(ref.i );
		ref.run();
		
		Demo4 ref2= (Demo4) ref;
		System.out.println(ref2.d);
		ref2.fun();
	}

}
class Demo1{
	int i=10;
	void run() {
		System.out.println("demo1");
	}
}
class Demo4 extends Demo1 {
	int d=20;
	void fun() {
		System.out.println("demo2");}
	}