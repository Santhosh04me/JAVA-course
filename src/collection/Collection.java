package collection;

import java.util.HashSet;

public class Collection {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> hs =new HashSet<Integer>();
		hs.add(10);
		hs.add(7);
		hs.add(8);
		hs.add(5);
		hs.add(3);
		System.out.println(hs);
		
		Employee e1=new Employee("santhosh",123,50000);
		Employee e2=new Employee("muthu",124,40000);
		Employee e3=new Employee("naveena",125,45000);
		Employee e4=new Employee("ranjith",222,466000);
		Employee e5=new Employee("ranjith",222,466000);
		
		HashSet<Employee> hs1 =new HashSet<Employee>();
		hs1.add(e1);
		hs1.add(e2);
		hs1.add(e3);
		hs1.add(e4);
		hs1.add(e5);
		System.out.println(e2.hashCode());
		System.out.println(e4.hashCode());
		System.out.println(e1.equals(e2));
		
		System.out.println(hs1);
		
		
		
		
		
		
		
		
		
		
	}

}
