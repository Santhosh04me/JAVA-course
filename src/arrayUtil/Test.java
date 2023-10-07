package arrayUtil;

import java.util.Arrays;

public class Test {

		@SuppressWarnings("unchecked")
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp e1=new Emp("san",24,25000);
		Emp e2=new Emp("muhtu",26,34000);
		Emp e3=new Emp("naveena",25,50000);
		Emp e4=new Emp("ranjith",21,75000);
		Emp[] e= {e1,e2,e3,e4};
		Cmp mc =new Cmp();
		System.out.println(e[1]);
		Arrays.sort(e,mc);
		for (int i=0;i<e.length;i++)	
			System.out.println(e[i]);

	}

}
