package practice;

import java.util.Scanner;

public class Loop {

	public static void main(String[] args) {
		int i=1;
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("how many stars do you want:");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			for (int j=1;j<=n;j++)
			{
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
		
//		while(i<=n) {
//			System.out.print("*");
//			i++;
//		}
//		for(i=0;i<=5;i++)
//		{
//			System.out.print(i);
//		}
//		System.out.println();
//		System.out.println(i);
//	}
//	while(i<=5) {
//		System.out.println(i);
//		i++;
//	}

}}
