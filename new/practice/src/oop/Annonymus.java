package oop;

class Cycle{
	void display() {
		System.out.println("im a cycle1");
	}
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
			System.out.println("im a tryCycle");
				}
			};
		c.display();
		
	}

}
