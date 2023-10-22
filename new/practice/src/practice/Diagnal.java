package practice;

public class Diagnal{
	
	public static void main(String[] args) {
		
		
		Diagnal ob=new Diagnal();
		int[][] math= {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		System.out.print( ob.diagnalSum(math));
	}

private int diagnalSum(int[][] mat) {
	int sum=0;
	int n=mat.length;
	int i=0,j=0;
	while(i<n) {
		sum+=mat[i][j];
		i++;
		j++;
	}
	 i=0;
	 j=n-1;
	while(j>=0)
	{
		if(i!=j) {
			sum+=mat[i][j];
			i++;
			j--;
		}
	}

return sum;	
}

}
