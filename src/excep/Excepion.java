package excep;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Excepion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Excepion ed =new Excepion();
           ed.divi();
	}

	@SuppressWarnings("resource")
	private void divi() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		try {
		int no1=sc.nextInt();
		
		int no2=sc.nextInt();
		
		int result =no1/no2;
		System.out.println("add:"+result);}
		catch(ArithmeticException ae)
		{
			System.out.print("try again");
			divi();
		}
		catch(InputMismatchException ime) {
			System.out.print("ok");
		}
		catch(Exception e) {
			System.out.print("unknown errorz");
		}
		add();
	}

	private void add() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in) ;
		int no1=sc.nextInt();
		int no2=sc.nextInt();
		int result =no1+no2;
		System.out.println("add:"+result);
	}
	
}
