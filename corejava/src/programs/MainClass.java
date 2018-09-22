package programs;

public class MainClass {
	public static void main(String[] args) {
	D ref= new D();
	ref.check(new B());
	ref.check(new C());
	ref.check(new A());
	ref.check(new E());
	}
}
 class A {
	int i=100;
	void demo()
	{System.out.println("A running");}
}
  class B extends A{
	 double d=5.5;
	 void demo() 
	 { System.out.println("B running");}
 }
 class C extends A{
	 double c=1.2;
	 void demo() 
	 { System.out.println("C running");}
 }
 class D{
	void check(A arg)
	{System.out.println(arg);
		arg.demo();
	}

 }
 class E extends B{
	 double c=1.2;
	 void demo() 
	 { System.out.println("e running");}
 }
