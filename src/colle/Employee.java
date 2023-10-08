package collection;

public class Employee {
	String name;
	int eid,salary;
	public Employee (String name,int eid,int salary)
	{
		this.name= name;
		this.eid =eid;
		this.salary=salary;
	}
	public String toString()
	{
		return this.name+ "--> "+this.eid+" -->"+this.salary+"\n";
	}
	public boolean equals(Object o)
	{
		Employee e2=(Employee)o;
		if (this.eid==e2.eid)
				return true;
//		int result =this.name.compareTo(e2.name)
//				if (result>0)
//					return true;
		return false;
	}
	public int hashCode()
	{
		return 100;
	}
	
	
}
