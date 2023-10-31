package collection;

import java.util.*;

public class QueueD {

	public static void main(String[] args) {
		
		Queue<Integer> q=new LinkedList<Integer>();
		q.add(2);
		q.add(4);
		q.add(8);
		q.add(5);
		System.out.println(q);
		
		System.out.println("head is:"+q.peek());
		System.out.println("head is:"+q);
		System.out.println("head is:"+q.remove());
		System.out.println("head is:"+q);
		System.out.println("head is:"+q.poll());
		System.out.println("head is:"+q);
		System.out.println("head is:"+q.poll());
		System.out.println("head is:"+q);
	}
 
}
