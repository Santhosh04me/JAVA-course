package oop;

class Cycle{
	void display() {
		System.out.println("im a cycle1");
	}
}


 interface Ridable {

	void ride();

}

//class trycycle extends Cycle{
//	void display() {
//		System.out.println("im a tryCycle");
//	}
//}

public class Annonymus {

	public static void main(String[] args) {
		Cycle c= new Cycle() {
				void display() {
			System.out.println("im a tryCycle-Annonymous");
				}
			};
		c.display();
		
		Ridable r3= () -> System.out.println("lambda  method");
		r3.ride();
		
	}

}
