package collectionSet;

import java.util.TreeSet;

public class treeset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet t=new TreeSet();
		t.add(800);
		t.add(200);
		t.add(400);
		t.add(100);
		t.add(500);
		t.add(600);
		t.add(700);
		t.add(300);
		//t.add(null);
		System.out.println(t);
		t.pollFirst();
		System.out.println(t);
		t.pollLast();
		System.out.println(t);
		

	}

}
