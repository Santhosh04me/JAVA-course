package practice;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		If ob=new If();
		int a,b , c;
		boolean d;
		Scanner sc=new Scanner(System.in);
//		int num;
//		System.out.println("enter the number: ");
//		num =sc.nextInt();
//		if(num>0) {
//			System.out.println(num +" is Pasitive number");
//		}
//		else if(num==0) {
//			System.out.println(num +" is Nuteral number");
//		}
//		else {
//			System.out.println(num + " is Negative Number");
//	}
	System.out.println("Enter the a, b, c");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		d=ob.ArithmaticExpression( a,b,c) ;
		
	System.out.println(d);
	}

	private boolean ArithmaticExpression(int a, int b, int c ) {
		// TODO Auto-generated method stub
		return (a+b==c)|| (a-b==c) ||(a*b==c) ||(a/b==c);
		
	}

	

}
