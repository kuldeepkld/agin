package corejava;

public class methover_1 {
public static void main(String[] args) {

	facebook_update ref= new facebook_update();
	ref.login("dob");
	ref.login(1234567890, "pwd");
	ref.login("kullu","pwd");
}
	
}
 class facebook {
	public void login(String un, String pwd) {
System.out.println("login wuth un and password");
	}
	public void login(long p_h, String pwd) {
		System.out.println("login using phone number and password");
	}
	} 
 class facebook_update extends facebook{
	public void login(String dob) {

		System.out.println("login using dob");
	}
}
 
 
