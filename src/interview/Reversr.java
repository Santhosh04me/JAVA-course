package interview;

import java.util.Scanner;

public class Reversr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,s=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		while(n>0) {
			s=s*10+(n%10);
			n/=10;
		}
		System.out.print(s);

	}

}
