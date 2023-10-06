package sorting;

public class BubbleSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar= {70,10,30,90,70,2220,330,};
		int temp;
		
		for (int j=1;j<ar.length;j++)
			{
		
		for (int i=0;i<ar.length-1;i++)
		{
			if(ar[i]>ar[i+1])
			{
				temp=ar[i];
				ar[i]=ar[i+1];
			   ar[i+1]=temp;
			}
		}
			
			}

		for  (int i=0;i<ar.length;i++)
		{
		System.out.print(ar[i]+" ");
		}
		int len =ar.length;
		System.out.println(""); //
		System.out.println("maximum is :"+ ar[len-1]);
	}
	

}
