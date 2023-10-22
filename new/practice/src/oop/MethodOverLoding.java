package oop;

public class MethodOverLoding {
	int lenght;
	 int breath;
	 int height;
	private int length;
	 
	 MethodOverLoding()
	 {
		 this.lenght=-1;
		 this.breath=-1;
		 this.height=-1;
		 
	 }
	 
	 MethodOverLoding(int l)
	 {
		this.length=height=breath=l;
		 
	 }
	 
	MethodOverLoding(int l,int b,int h)
	 {
		 this.lenght=l;
		 this.breath=b;
		 this.height=h;
		 
	 }

	
	static double max(double a, double b) {
		// TODO Auto-generated method stub
		return a>b?a:b;
	}

	static int max(int a, int b) {
		// TODO Auto-generated method stub
		return a>b?a:b;
	}
	public static void main(String[] args) {
		System.out.println(max(5,7));
		System.out.println(max(5.7,4.6));
		
		MethodOverLoding m1=new MethodOverLoding();
		
		MethodOverLoding m2=new MethodOverLoding(4,5,6);
		
		MethodOverLoding m3=new MethodOverLoding(4);
		
		
		System.out.println(m2.lenght);
		System.out.println(m3.breath);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
