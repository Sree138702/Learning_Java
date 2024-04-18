package basicsofjava;

import java.util.HashSet;

public class Collection_HashSet {

	public static void main(String[] args) {
		HashSet h1=new HashSet();
		h1.add(false);
		h1.add(560);
		h1.add(560);
		h1.add(56000);
		h1.add(34.12);
		h1.add("Sree");
		h1.add('S');
		h1.add(null);
		h1.add(null);
		
		System.out.println(h1);
		
		
		HashSet h2=new HashSet();
		h2.add(false);
		h2.add(576);
		h2.add(87000);
		h2.add(87000);
		h2.add(45.12);
		h2.add("Chaithu");
		h2.add('C');
		h2.add(null);
		h2.add(null);
		
		System.out.println(h2);
	}

}
