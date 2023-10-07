package arrayUtil;

public class Emp  {
	String name;
	int age,salary;

	public Emp(String name ,int age,int salary)
	{
		this.name=name;
		this.age=age;
		this.salary=salary;
	}
	
	public String toString(Object arg0)
	{
		return this.name +" -->"+ this.age+"-->"+this.salary;
	}
	public int compareTo(Object arg0)
	{
		return 0;
	}
			

}
