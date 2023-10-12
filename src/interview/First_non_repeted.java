package interview;

public class First_non_repeted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="santhosh";
		for(int j=0;j<s.length();j++)
		{
		boolean repeated =false;
		char ch=s.charAt(j);
	
		for(int i=0;i<s.length();i++)
		{
			char ch2 =s.charAt(i);
			if(i!=j)
			{
				if(ch==ch2)
				{
					repeated =true;
					break;
				}
			}
		}
		if(repeated==false)
		{
			System.out.print("First non repeted  "+ch);
			break;
		}
		
	}

	}

}
