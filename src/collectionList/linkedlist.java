package collectionList;

import java.util.LinkedList;

public class linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList ll= new LinkedList();
		ll.add("Ganpati");
		ll.add("100");
		ll.add('A');
		ll.add(null);
		ll.add(null);
		ll.add(100);
		System.out.println(ll);
		
		System.out.println(ll.size());
		System.out.println(ll.isEmpty());
		ll.add(1, "Suresh");
		System.err.println(ll);
		ll.remove(1);
		System.out.println(ll);

	}

}
