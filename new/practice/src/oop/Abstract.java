package oop;

abstract class Member{
	private String name;
	abstract void WelcomeMessage();
}
 
class student extends Member{
	void WelcomeMessage() {
		System.out.println("Hello Student....");
	}
}

class Teacher extends Member{
	void WelcomeMessage() {
		System.out.println("Hello Teacher....");
	}
}

public class Abstract{

	public static void main(String[] args) {
		student s1=new student();
		Teacher t1=new Teacher();
		Member[] m=new Member[4];
		m[0]=new student();
		m[1]=new student();
		m[2]=new Teacher();
		m[3]=new Teacher();
		for(Member m2: m) {
			m2.WelcomeMessage();
			
			
		}
		
	}
	
}
