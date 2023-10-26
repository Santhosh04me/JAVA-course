package inheritance;

public class Wrapper {

	public static void main(String[] args) {
		int i=3;
		Integer i2=Integer.valueOf(12);
		Integer  i3=new Integer(23);//not recomented this type of approch
		System.out.println("i value is:"+i+"\ni2 value is: "+i2+"\ni3 value is :"+i3);
		Integer i4=Integer.valueOf(i);
		int j=i4.intValue();
		System.out.println("unboxing :"+j);
		Integer e=23;// its convert into Intege.valueOf(23) this know as -autoboxing
		int k=i2;//auto unboxing
		System.out.println( "auto-unboxing values: "+k);
		String s="123";
		int e1=Integer.parseInt(s);
		System.out.println("String to int :"+e1);
	}

}
