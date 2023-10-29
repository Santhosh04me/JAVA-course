package exceptionHandling;
import java.io.*;
import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {
		
		try {
		int a=10,b=0;
		
		int arr[] =null;
		System.out.println(arr[1]);
		int c=a/b;
		System.out.println(c);
			}
		
		catch(ArithmeticException e) {
			System.err.println("Error occure1");
		}
		catch(Exception o) {
			System.err.println("Error occure");
		}
	
		File file=new File("abc.txt");
		try {
			FileInputStream fs=new FileInputStream(file);
		} catch (FileNotFoundException e) {
			System.out.println("hi");
//			e.printStackTrace();
		}
		
//		try with resource--prevent leakage
		try(Scanner sc=new Scanner(System.in)){
			int i=sc.nextInt();
		}
//		System.out.println(i);
		double bal=500,withdraw=700;
		try {
		if(bal<withdraw)
			throw new InsufficenteException(withdraw-bal);
		}
		catch(InsufficenteException is) {
			System.out.println("Not enough money:"+is.amount);
		}
		
		
	}

}
