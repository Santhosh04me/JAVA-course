package abstraction.learning;

public class child extends parent{
	public static void main(String[] args) {
		
	child ch= new child();
	ch.study();
	}
	@Override //annotation
	void study() {
		// TODO Auto-generated method stub
		System.out.println("college");
	}

}
