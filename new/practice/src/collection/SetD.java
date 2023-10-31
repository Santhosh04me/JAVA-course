package collection;

import java.util.*;

public class SetD {

	public static void main(String[] args) {
		
		HashSet<String> h=new HashSet<String>();//no order
		
		h.add("jan");
		h.add("feb");
		h.add("mar");
		h.add("feb");
		h.add("april");
		System.out.println(h);
		
LinkedHashSet<String> h1=new LinkedHashSet<String>();//insertion order
		
		h1.add("jan");
		h1.add("feb");
		h1.add("mar");
		h1.add("feb");
		h1.add("april");
		System.out.println(h1);
		
TreeSet<String> h2=new TreeSet<String>();//alphabet order
		
		h2.add("jan");
		h2.add("feb");
		h2.add("mar");
		h2.add("feb");
		h2.add("april");
		System.out.println(h2);
		
		
	}

}
