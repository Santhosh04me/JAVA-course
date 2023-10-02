package ExceptionHandling;

import java.util.InputMismatchException;

public class exception3 {

	public static void main(String[] args)  throws Exception {
		// TODO Auto-generated method stub
	exception2 ed =new exception2();
	try {
		ed.calculate();
		
	}
	catch(InputMismatchException | ArithmeticException ie) {
		System.out.print("gives only number");
	}

	}

}
