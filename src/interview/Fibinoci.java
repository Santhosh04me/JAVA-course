package interview;

import java.util.Scanner;

public class Fibinoci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n ,a=1,b=-1,c=0;
		Scanner sc=new Scanner(System.in);
		n= sc.nextInt();
		while (n>0)
		{
			c=a+b;
			System.out.println(c+" ");
			a=b;
			b=c;
			n--;
		}
		
		
		
		
	}

}
