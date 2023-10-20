package interview;

import java.util.Scanner;

public class Farward {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,s=0,b=1,r,c;
		Scanner sc =new Scanner(System.in);
		n=sc.nextInt();
		r=sc.nextInt();
		while(n!=0)
		{
			c=n%10;
			if(c!=r) {
			s=s+b*c;
			b*=10;
			}
			n/=10;
		}
		System.out.print(s);
		
		
	}

}
