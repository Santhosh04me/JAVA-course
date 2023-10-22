package practice;

public class ForEach {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6};
		int sum=0;
		for(int x:arr)
		{
			System.out.println(x);
			sum+=x;
			
		}
		System.out.print(sum);
	}

}
