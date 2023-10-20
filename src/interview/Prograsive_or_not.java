package interview;

import java.util.Scanner;

public class Prograsive_or_not {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i=9,b,f=1,a;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		while(n!=0)
		{
			a=n%10;
			if(a<=i) {
				i=a;
			}
			else {
				f=0;
				break;
			}
			n/=10;
		}
		System.out.print(f==1?"progressive":"not progressive");

	}

}
