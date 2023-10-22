package practice;

public class Box2 {
	int lenght;//instance varaiables
	int breath;
	int height;
	
	 Box2(int l,int b,int h)
	 {
		 this.lenght=l;
		 this.breath=b;
		 this.height=h;
		 
	 }
	 
	 void set(int l,int b,int h)
	 {
		 lenght=l;
		 breath=b;
		 height=h;
		 
	 }


	public static void main(String[] args) {
		Box2 blackBox =new Box2(23,5,7);  

	}

}
