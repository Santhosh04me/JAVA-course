package arrayUtil;

import java.util.Comparator;

public  class Mycomparator implements Comparator{

	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		String l1=(String)o1;
		String l2=(String)o2;
		if (l1.length()>l2.length())
			return +1;
		else if(l1.length()<l2.length())
			return -1;
		else
			return 0;
	
	}
	

}
