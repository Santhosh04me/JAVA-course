package arrayUtil;
import java.util.Comparator;

public class Cmp implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Emp e1=(Emp)o1;
		Emp e2=(Emp)o2;
		
		if (e1.age>e2.age)
			return -1;
		else if (e1.age<e2.age)
			return +1;
		else
			return 0;
	}

}
