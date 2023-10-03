package debugging;

public class RecursiveDebug {

	public static void main(String[] args) {
		int no=4, num=4;
		// TODO Auto-generated method stub
		pattern(no,num);
		
	}

	private static void pattern(int n,int num) {
		// TODO Auto-generated method stub
		if(n==0)
			return;
		row_print(num-n+1,num-n+1);
		System.out.println();
		pattern(n-1,num);
		
	}

	private static void row_print(int no,int val) {
		// TODO Auto-generated method stub
		if(no==0)
			return;
		System.out.println(val+" ");
		row_print(no-1,val);
	}
	

}
