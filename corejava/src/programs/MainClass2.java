package programs;

public class MainClass2 {

	public static void main(String[] args) {
		A ref= new A();
		System.out.println("i value is "+ref.i);
		ref.disp();
		System.out.println("-------------- ");
		B ref1= new B();
		System.out.println("i value is "+ref1.i);
		System.out.println("d value is "+ref1.d);
		ref1.disp();
		ref1.demo();
		System.out.println("-------------- ");
		C ref2= new C();
		System.out.println("i value is "+ref2.i);
		System.out.println("d value is "+ref2.d);
		System.out.println("c value is "+ref2.c);
		ref2.disp();
		ref2.demo();
		ref2.pemo();

	}

}
