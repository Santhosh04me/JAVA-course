package exceptionHandling;

public class InsufficenteException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	double amount;
	public InsufficenteException(double d) {
		amount=d;
	
	}
	
}
