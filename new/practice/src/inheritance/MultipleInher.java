package inheritance;



class A{
	
}

class B{
	void disply()
	{
		System.out.println("From class B");
	}
}

class C extends B{
	
}


public class MultipleInher {

	public static void main(String[] args) {
		C c=new C();
		c.disply();
		
		
		
	}

}
