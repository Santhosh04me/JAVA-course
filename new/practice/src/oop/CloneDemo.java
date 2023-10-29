package oop;

class Department{
	
	int deptId;
	String name;
	Department(int id,String n){
		deptId=id;
		name=n;
	}
}
class Student implements Cloneable{
	int id;
	String name;
	Department dept;
	Student(int i,String n,Department d){
		id=i;
		name=n;
		dept=d;
	}
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

public class CloneDemo {

	public static void main(String[] args) throws CloneNotSupportedException {
		Department dept=new Department(1,"physics");
		Student  s1=new Student(1,"santhosh",dept);
		Student s2=(Student) s1.clone();
	
		
	}

}
