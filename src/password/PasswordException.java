package password;

public class PasswordException extends Exception {
	
	private static final long serialVersionUID = 1L;

	public void verifyPassword(String pwd) throws PasswordException
	{
		if(pwd.length()<8)
		{
			PasswordException pe =new PasswordException() ;
			throw pe;
		}
		else
		{
			System.out.print("Strong password");
		}
	}

}
