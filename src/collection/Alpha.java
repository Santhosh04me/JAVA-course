package collection;

public class Alpha <T extends Employee>{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Alpha<String> a1=new Alpha();
		Alpha<Employee> a2=new Alpha<Employee>();
		System.out.println(a2.getClass().getTypeName());
		

	}

}
