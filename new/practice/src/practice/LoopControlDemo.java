package practice;

import java.util.Scanner;

/*
 * for Given n find the nearest number divible by 10 that is less than or equal to n
 * 78- 70
 * 
*/public class LoopControlDemo {

	public static void main(String[] args) {
		double n,sum=0.0;
		int a[]=new int[6];
		Scanner sc = new Scanner(System.in);
		System.out.println("your result is:");
		for(int i=0;i<a.length;i++)
			a[i]=sc.nextInt();
		System.out.println("your result is :");
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]);
		
		
//		int[] a= {12,4,67,85,90};
		for (int i=0;i<a.length;i++)
			System.out.println(a[i]);
		
		
		
		
		
		/*
		 * while(true) { n=sc.nextDouble(); if(n<0.0) { break; } sum+=n; }
		 * System.out.println(sum);
		 */
		
		
		
		/*
		 * while(true) { if(n%10==0) { System.out.println(n); break; } n--; }
		 */}

}
