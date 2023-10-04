package interview;

public class ToLower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abCDFgH 123#$%";
//		s=s.toLowerCase();
//		System.out.print(s);
		
		
		for (int i=0;i<s.length();i++)
		{
			char ch =s.charAt(i);
			if(ch>='A' && ch<='Z')
			{
			  ch=(char)(ch+32);
			  System.out.print(ch);
			}
			else
				 System.out.print(ch);
		}

	}

}
