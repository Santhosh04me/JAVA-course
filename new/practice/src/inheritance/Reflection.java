package inheritance;

import java.lang.reflect.Method;

public class Reflection {

	public static void main(String[] args) {
		Employee e
		
		=new Employee("san",346);
		Class<? extends Employee> c=e.getClass();
		System.out.println("class is :"+c.getName());
		Method[] me=c.getMethods();
		for (Method m:me) {
			System.out.println(m.getName());
		}
		
		
	}

}
