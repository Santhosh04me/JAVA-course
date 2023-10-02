package recursion;

public class recursion1 {
	int total =0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		recursion1 rs =new recursion1();
		int no=5;
		rs.display(no);
		System.out.println(rs.fact(no));

	}

	private int fact(int i) {
		// TODO Auto-generated method stub
		if (i==1)
			return 1;
		else 
			return i*fact(i-1);
			
		
	}

	private void display(int no) {
		// TODO Auto-generated method stub
		total +=no;
		System.out.println(no);
		no--;
		if (no>0)
		display(no);
		else
			System.out.println("ok"+total);
		
			
		
	}

}
