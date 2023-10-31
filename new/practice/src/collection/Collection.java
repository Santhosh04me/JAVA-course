package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Collection {

	public static  void main(String[] args) {

		ArrayList list=new ArrayList();
		for(int i=1;i<10;i++) {
			list.add(i);
		}
		list.add("santhosh");
		System.out.println(list);
		System.out.println(list.get(4));
		list.set(4, 40);
		System.out.println(list);
		list.remove(4);
		System.out.println(list);
		Boolean h=list.contains(3);
		System.out.println(h);
		System.out.println("Using iterator");
		
		Iterator<Integer> i=list.iterator();
		while(i.hasNext()) {
		System.out.println(i.next());
		}
	}

}
