package corejava;

public class methodover_2 {

	public static void main(String[] args) {

		search_train_update ref= new search_train_update();
		ref.search("kld", "lko");
		ref.search(12534);
		ref.search("12/8/2018","9:30", "special");
	}
		
	}
	 
class search_train {
	public void search(String source, String destination) {
System.out.println("display train list between source and destination");
	}
	public void search(int number) {
		System.out.println("display train's stopage details");
	}
	} 
 class search_train_update extends search_train{
	public void search(String date,String time, String train_type) {

		System.out.println("display the specific train list of the particular date and time");
	}
}