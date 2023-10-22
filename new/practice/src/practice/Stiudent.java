package practice;

public class Stiudent {
	String name;
	int rollNo;
//	int mark[]=new int[3];
	
	String total()
	{  
//		int sum=0;
//		for(int x:mark) {
//			sum+=x;
//		}
		
		
		return name+" "+ rollNo;
	}

	public static void main(String[] args) {
		Stiudent san=new Stiudent();
		san.name="santhosh";
		san.rollNo=111;
//		san.mark[3]= {23,44,45};
		System.out.println(san.total());
		
		
	}

}
