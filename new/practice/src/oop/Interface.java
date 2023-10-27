package oop;

class vechile{
	void ride() {
		
	}
}
class car extends vechile{
	void ride() {
		System.out.println("your riding car");
	}
}

class bike extends vechile{
	void ride() {
		System.out.println("your riding bike");
	}
}

class machanic{
	void check(vechile v) {
		System.out.println("Checking");
		v.ride();
	}
}


public class Interface {

	public static void main(String[] args) {
		machanic m=new machanic();
		car c=new car();
		m.check(c);
		bike b= new bike();
		m.check(b);
		
	}

}
