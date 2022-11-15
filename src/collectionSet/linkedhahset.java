package collectionSet;

import java.util.LinkedHashSet;

public class linkedhahset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashSet lhs=new LinkedHashSet();
		lhs.add("Rinky");
		lhs.add(100);
		lhs.add('A');
		lhs.add(100);
		lhs.add(null);
		lhs.add(null);
		System.out.println(lhs);
		System.out.println(lhs.size());
		System.out.println(lhs.isEmpty());

	}

}
