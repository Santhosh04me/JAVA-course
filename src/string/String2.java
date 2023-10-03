package string;

public class String2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="santhosh";//old
		System.out.println("hascode:"+name.hashCode());
		name="navi"; //new memory created
		System.out.println("hascode:"+name.hashCode());
		
		String bank="sbi";
		System.out.println("hascode b1:"+bank.hashCode());
		String bank2="sbi";
		System.out.println("hascode b2:"+bank2.hashCode());
		String bank3="sbi";
		System.out.println("hascode b3:"+bank3.hashCode());
		bank2="citybank";
		System.out.println("hascode b2:"+bank2.hashCode());
		
	}

}
