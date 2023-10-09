package collection;

public class Gentric <T>{
	T t;
	public Gentric(T ob)
	{
		this.t=ob;
	}
	public void show()
	{
		System.out.println("class of this object is:");
//		System.out.println(t.getClass().getTypeName());
		String s=t.getClass().getTypeName();
		if (s.contentEquals("java.lang.Integer"))
		{
			
		}
		else
		{
			
		}
	}

}
