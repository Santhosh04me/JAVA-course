package oop;

public class Box {
	int lenght;//instance varaiables
	int breath;
	int height;
	static int count;
	
	
static {
		System.out.println("staic action");
		count=0;
	}

	Box(int l,int b,int h)
	 {
		 this.lenght=l;
		 this.breath=b;
		 this.height=h;
		 count++;
		 
	 }
	
	Box(Box b) { //copy constructor
		lenght=b.lenght;
		breath=b.breath;
		height=b.height;
		count++;
		
		}

	 boolean isEqual(Box b1) {
			
		 if(lenght==b1.lenght && height==b1.height && breath==b1.breath)
			 return true;
		 
		 return false;
	}
static void displayBoxCount()
{
	System.out.println("box count :"+count);
}
	
	public static void main(String[] args) {
		System.out.println("main method is start ....");
		System.out.println("before creating object");
		Box blackBox=new Box(6,4,3);
		System.out.println("After creating object");
		Box b1=new Box(6,4,2);
		System.out.println("blacbox ==b1   -->"+blackBox.isEqual(b1));
		
		Box b2=new Box(b1);
		System.out.println("blacbox : "+b2.lenght);
		System.out.println("count :"+ Box.count);
		Box.displayBoxCount();
		
	}

	
}
