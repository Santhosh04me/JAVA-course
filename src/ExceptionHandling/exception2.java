package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class exception2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		exception2 ed =new exception2();
		ed.display();
		ed.calculate();

	}

	public void calculate()  
	{
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the two number:");
		int no1 =sc.nextInt();
		int no2 =sc.nextInt();
		System.out.print(no1/no2);
		
	}

	public void display() {
		// TODO Auto-generated method stub
		
		int no=10, no2=0, no3=-5;
		try {
		
		int[] ar =new int[no3];
		System.out.print(no/no2);
		
		System.out.print(ar);
		}
		catch(ArithmeticException | NegativeArraySizeException nae) 
		{
			System.out.println(nae.getMessage());
			
			System.out.print("check");
			}
	}

}
