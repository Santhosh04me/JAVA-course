package password;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
   PasswordException pe =new PasswordException();
		
	try {
		pe.verifyPassword("kamal");
	} catch (PasswordException e) {
		// TODO Auto-generated catch block
		System.out.println("too small");
	}
		
	}

}
