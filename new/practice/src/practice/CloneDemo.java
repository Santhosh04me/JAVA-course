package practice;



class Department implements Cloneable{
	
	int deptId;
	String name;
	Department(int id,String n){
		deptId=id;
		name=n;
	}
	void diplay() {
		System.out.println("id is :"+deptId);
		System.out.println("name:"+name);
	}
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
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
	void diplay() {
		System.out.println("id is :"+id);
		System.out.println("name:"+name);
		dept.diplay();
	}
	protected Object clone() throws CloneNotSupportedException {
		Student s=(Student)super.clone();
		s.dept=(Department)s.dept.clone();
		return s;
	}
}

public class CloneDemo{

	public static void main(String[] args) throws CloneNotSupportedException {
		Department dept=new Department(1,"physics");
		Student  s1=new Student(1,"santhosh",dept);
		Student s2=(Student) s1.clone();
		
		dept.name="math";
		s1.diplay();
		s2.diplay();
	
		
	}

}
