package oop;

public class PassRef {

	int lenght;//instance varaiables
	int breath;
	int height;

	PassRef(int l,int b,int h)
	 {
		 this.lenght=l;
		 this.breath=b;
		 this.height=h;
		 
	 }
	 boolean isEqual(PassRef b1) {
		b1.lenght++;	
		lenght++;
		 if(lenght==b1.lenght && height==b1.height && breath==b1.breath)
			 return true;
		 
		 return false;
	}
	
	static void increament(int a) {
		a++;
	}
	public static void main(String[] args) {
		
		int a=10;
		PassRef s1=new PassRef(5,4,3);
		PassRef s2=new PassRef(5,4,3);
		increament(a);
		System.out.println(a);
		
//		s1.isEqual(s2);
		System.out.println(s2.lenght+" ---"+s1.lenght);
		
		PassRef s3=s1.double1();
		System.out.println(s3.lenght);
	}
	PassRef double1() {
		PassRef temp=new  PassRef(2*lenght,2*breath,2*height);	
		
		return temp;
	}

}
