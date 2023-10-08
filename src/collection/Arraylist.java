package collection;

import java.util.ArrayList;
import java.util.TreeSet;

public class Arraylist {

	public static <E> void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar=new int[5];
		ar[0]=10;
//		ar[1]=11.4f;
		TreeSet<Integer> ts =new TreeSet<Integer>();
		ts.add(5);
		ts.add(10);
		ts.add(8);
		
		System.out.println(ts);				
		Employee e1=new Employee("santhosh",23,24000);
//		System.out.println(e1);
		
		ArrayList<Employee> al=new ArrayList<Employee>();
		al.add(e1);
		System.out.println(al.get(0));
		
		Object o =al.get(0);
		Employee em=(Employee) o;
		System.out.println(em.name);
		
		TreeSet<String> tt =new TreeSet<String>();
		tt.add("56");
		tt.add("abs");
		System.out.println(tt);
		
		ArrayList<String> al1 =new ArrayList<String>();
		al1.add("santhosh");
		al1.add("naveena");
		
		Arraylist  a=new Arraylist();
		a.display(al1);
//		System.out.println(al1);
		ArrayList<Integer> al2 =new ArrayList<Integer>();
		al2.add(25);
		al2.add(6);
		a.display(al2);
		
		
	}

	private void display(ArrayList<? extends String> al) {
		// TODO Auto-generated method stub
		System.out.println(al);
	
	}

}
