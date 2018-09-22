package programs;

public class F {
	public static void main(String[] args) {
		H d = new K();
		d.disp();}}
 class H {
		void disp() {
			System.out.println("HHHH");}}
class G extends H {
		void disp1() {
			System.out.println("GGGG");}}
class I extends G {
	  void disp1() 
	 {System.out.println("IIII");}}
class J extends I {
		  void disp() 
		 {System.out.println("JJJJ");}}
class K extends J {
	  void disp1() 
	 {System.out.println("KKKK");}}

