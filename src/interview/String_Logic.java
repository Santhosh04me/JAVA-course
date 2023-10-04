package interview;

public class String_Logic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1= "Today is Holiday";
		int start =0 ,end=s1.length()-1;
		
		for (int i= end;i>=0;i--)
		{
			if(s1.charAt(i)!=' ')
			{
				continue;
			}
			else
			{
				start =i+1;
				reverse(s1,start,end);
				end=i-1;
			}
		}
		reverse(s1,0,end);
		
		
	}

	private static void reverse(String s1, int start, int end) {
		// TODO Auto-generated method stub
		String s2="";
		for(int i=start;i<=end;i++)
		{
			s2=s2+s1.charAt(i);
		}
		s2+=" ";
		System.out.print(s2);
	}

}
