package string;

public class Stringlr {
	int price;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=new String();
		System.out.println(s);

		Stringlr sl=new Stringlr();
		Stringlr s2=new Stringlr();
		System.out.println(sl);
		sl.price=100;
		s2.price=100;
		System.out.println(sl.hashCode());//integer hashcode
		
		System.out.println(println());
		System.out.println(sl==s2);
		
		if(sl.equals(s2))
		{
			System.out.println("equal");
		}
		else
		{
			System.out.println("not");
		}
		
		
		
	}
	public boolean equals(Object o) //equals override
	{
		Stringlr s =(Stringlr)o; 
		if (this.price==s.price)
			return true;
		else
			return false;
	}
	public int hashCode() //over ride hashCode
	{
		return 12345;
	}
	public String toString()//over ride toString
	{
	return "santhosh";	
	}
	public static String println()
	{
		return "hi";
	}

}
