package basicsofjava;

import java.util.TreeSet;

public class Collection_TreeSet {

	public static void main(String[] args) {
		TreeSet t1=new TreeSet();
		t1.add(true);
		t1.add(true);//not accepting repeated values
		//t1.add(100);
		//t1.add(3600);
		//t1.add(31.55);
		//t1.add(null);
		//t1.add("Free");
		//t1.add('T');
		//t1.add(7609);
		System.out.println(t1);
		
		TreeSet t2=new TreeSet();
		t2.add(false);
		//t2.add(200);
		//t2.add(3600);
		//t2.add(81.55);
		//t2.add(null);
		//t2.add("Chubby");
		//t2.add('S');
		//t2.add("See");
		//t2.add('T');
		//t2.add(7609);
		System.out.println(t2);
		
	}

}
