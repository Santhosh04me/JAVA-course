package oop;

public class Box {
	int lenght;//instance varaiables
	int breath;
	int height;

	Box(int l,int b,int h)
	 {
		 this.lenght=l;
		 this.breath=b;
		 this.height=h;
		 
	 }
	
	Box(Box b) { //copy constructor
		lenght=b.lenght;
		breath=b.breath;
		height=b.height;
		
		}

	public static void main(String[] args) {
		
		Box blackBox=new Box(6,4,3);
		Box b1=new Box(6,4,2);
		System.out.println("blacbox ==b1   -->"+blackBox.isEqual(b1));
		
		Box b2=new Box(b1);
		
	}

	 boolean isEqual(Box b1) {
		
		 if(lenght==b1.lenght && height==b1.height && breath==b1.breath)
			 return true;
		 
		 return false;
	}

}
