package collectionSet;

import java.util.HashSet;

public class hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet hs=new HashSet();
		hs.add("Ankita");
		hs.add(100);
		hs.add('A');
		hs.add(null);
		hs.add(null);
		hs.add(100);
		System.out.println(hs);
		System.out.println(hs.size());
		System.out.println(hs.isEmpty());
		hs.clear();
		System.out.println(hs);

	}

}
