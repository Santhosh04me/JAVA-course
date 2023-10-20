package practice;

import java.util.Scanner;

public class Scan {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
			String name=sc.nextLine();
			System.out.println("hello sa"+name);
			int rating=sc.nextInt();
			short no=sc.nextShort();
			System.out.println("rating"+rating);
			System.out.println("Number"+no);
		}
		

	}
	

}
