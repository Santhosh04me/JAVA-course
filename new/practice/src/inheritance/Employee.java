package inheritance;

public class Employee implements Comparable<Employee>{
	String name;
	double salary;
	Employee(String n,double s){
		name=n;
		salary=s;
	}
//	Employee(){
//		name="";
//		salary=0.0;
//	}
	String getName()
	{
		return name;
	}
	void setName(String n){
		name=n;
	}
	double getSalary() { return salary;}
	void setSalary(double s) { salary=s;} 
	
	
	void raiseSalary(double percent) {
		salary+=salary*percent/100;
	}
	
	
	
	
	public static void main(String[] args) {
		
		
		
	}
	@Override
	public int compareTo(Employee e) {
		if(this.salary==e.salary)
			return 0;
		if(this.salary<e.salary)
			return -1;
		return 1;
}
