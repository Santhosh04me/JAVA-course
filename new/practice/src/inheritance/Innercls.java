package inheritance;

import inheritance.Outer.Inner;

class Outer{
	
	int num;
	void outerDisplay() {
		System.out.println("Outer display");
	}
	static class Inner{
		int x;
		 void InnerDisplay() {
			System.out.println("Inner display");
		}
	}
}
public class Innercls {

	public static void main(String[] args) {
		Outer o=new Outer();
		o.outerDisplay();
//		Inner i= new Inner();
//		Outer.Inner i=o.new Inner();
		Outer.Inner i=new Outer.Inner();
		
		Inner.InnerDisplay();
		
		
	}

}
