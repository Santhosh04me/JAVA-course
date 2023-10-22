package practice;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
	
		int a,b;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the first number:");
		a=sc.nextInt();
		System.out.println("Enter the second number:");
		b=sc.nextInt();
		System.out.println("Enter the operator +,-,*,/or %");
		char operator;
		operator=sc.next().charAt(0);
		
		
		switch(operator) {
		case '+':
			System.out.println(a+"+"+b+"="+(a+b));break;
		case '-':
			System.out.println(a+"-"+b+"="+(a-b));break;
		case '*':
			System.out.println(a+"*"+b+"="+(a*b));break;
		case '/':
			System.out.println(a+"/"+b+"="+(a/b));break;
		case '%':
			System.out.println(a+"%"+b+"="+(a%b));break;
		default:
			System.out.println("Enter the correct operation");
			
		
		}
		
		
		
	}

}
