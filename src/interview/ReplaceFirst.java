package interview;

public class ReplaceFirst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="a rose is a rose is a rose";
		/*s=s.replaceFirst("rose", "jsmin");
		 System.out.print(s);*/
		contain(s);

	}

	private static void contain(String s) {
		// TODO Auto-generated method stub
		String s2="rose";
		for(int i=0;i<=s.length();i++)
		{
			if(s.charAt(i)==s2.charAt(0))
			{
			int count=0;
			for(int j=0;j<=s2.length();j++)
			{
				if(s.charAt(i)==s2.charAt(j))
				{
					count++;
				}		
			}
			if(count==s2.length())
			{
				System.out.println("yes contain");
			}
			else
			System.out.println("no contain");
		}
		
	}

}
