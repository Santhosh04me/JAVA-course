package practice;

public class Missing_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,0,3,4};
		Missing_number ob=new Missing_number();
		System.out.println( ob.Missnumber(a));
		

	}

	public int Missnumber(int[] nums) {
	     int n=nums.length;
	     int sum=0;
	     for(int i=0;i<n;i++)
	    	 sum+=nums[i];
		
		return sum-n*(n-1)/2 ;
	}

}
