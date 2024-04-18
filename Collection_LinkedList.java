package basicsofjava;

import java.util.Collections;
import java.util.LinkedList;

public class Collection_LinkedList {

	public static void main(String[] args) {
		LinkedList l1=new LinkedList();
		l1.add(34);
		l1.add(650);
		l1.add(8900);
		l1.add(27.11);
		l1.add(true);
		l1.add("Sree");
		l1.add("we");
		l1.add('V');
		l1.add("null");
		
		System.out.println(l1);
		
		LinkedList l2=new LinkedList();
		l2.add(34);
		l2.add(650);
		l2.add(8900);
		l2.add(8900);
		l2.add(27.11);
		l2.add(false);
		l2.add("Sree");
		l2.add("we");
		l2.add('V');
		l2.add("null");
		l2.add("null");
		l2.add("null");
		System.out.println(l2);
	}

}
