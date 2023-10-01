package ExceptionHandling;

import java.util.Scanner;

public class ExceptionDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExceptionDemo1 ed= new ExceptionDemo1();
		ed.divide();
		ed.hi();
		

	}

	private void hi() {
		// TODO Auto-generated method stub
		
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

	private void divide() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int no1=sc.nextInt();
		int no2=sc.nextInt();
//		try {
		int result =no1/no2;
		System.out.println("divide:"+result);
//		}
//		catch(ArithmeticException ae)
//		{
//			System.out.println("try again");
//			divide();
//		}
		
		add();
	}

}}
