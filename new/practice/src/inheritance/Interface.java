package inheritance;

import java.util.Arrays;

public class Interface extends Employee{

	public static void main(String[] args) {
	
		Employee[] e= new Employee[3];
		e[0]=new Employee("san",23999);
		e[1]=new Employee("muthu",20999);
		e[2]=new Employee("naveena",18999);
		Arrays.sort(e);
		for(Employee e1:e)
			System.out.println(e1);
		
	}
	
	
	
	
	
	
}


}
