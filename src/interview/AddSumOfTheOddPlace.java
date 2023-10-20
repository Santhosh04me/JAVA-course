package interview;

import java.util.Scanner;

public class AddSumOfTheOddPlace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,c=0,s=0,a;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int t=n;
		while(n!=0) {
			n/=10;
			c++;
//			System.out.print(c);
		}
//		System.out.print(c);
		while(t!=0)
		{
		a=t%10;
		if(a%2!=0)
		{
			s+=a;
		}
		t--;
		t/=10;
		}
		System.out.print(s);
		
	}

}
