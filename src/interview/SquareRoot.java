package interview;

import java.util.Scanner;

public class SquareRoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n ;
		float s,t=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		s=n;
		while(t!=s)
		{
			t=s;
			s=(n/t+t)/2;
			
		}
		if(s==(int)s)
			System.out.print((int)s);
		else
		{
			System.out.print(s);
		}
		

	}

}
