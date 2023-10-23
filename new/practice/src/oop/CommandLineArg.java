package oop;

public class CommandLineArg {
	static int minValue(int ... values)
	{
		int min=Integer.MAX_VALUE;
		for(int x:values)
		{
			if(x<min)
				min=x;
		}
		
		return min;
	}
	static double minValue(double ... values)
	{
		double min=Integer.MAX_VALUE;
		for(double x:values)
		{
			if(x<min)
				min=x;
		}
		
		return min;
	}

	public static void main(String[] args) {
		
		/*
		 * for(int i=0;i<args.length;i++) { System.out.println(args[i]); }
		 */
		
		
		int m =minValue(3,4,5,6,2,7);
		int o =minValue();
		
		System.out.println(m);
		double n =minValue(7.5,8.6,8,3,1);
		System.out.println(n);
		System.out.println(o);
	}

}
