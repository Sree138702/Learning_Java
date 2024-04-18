package basicsofjava;

//import java.util.Collections;
//import java.util.List;
import java.util.PriorityQueue;

public class Collection_PQ {

	public static void main(String[] args) {
		PriorityQueue p1=new PriorityQueue();
		p1.add(45000);
		p1.add(4500);
		p1.add(569870);
		p1.add(56987);
		//p1.add(3.14);//double value is not accepting
		//p1.add("GroTech");//string is not accepting
		//p1.add(true);//boolean value is not accepting
		//p1.add('R');//char value is not accepting
		//p1.add(null);//null value is not accepting
		//p1.add("see");
		//it is accepting the repeated values.. 
		System.out.println(p1);

		PriorityQueue p2=new PriorityQueue();
		p2.add(45000);
		p2.add(4500);
		p2.add(56987);
		//p2.add(3.14);
		//p2.add("GroTech");
		//p2.add(true);
		//p2.add('R');
		//p2.add(null);
		//p2.add(null);
		//p2.add("see");
		//p2.add('R');
		//p2.add('D');
		
		System.out.println(p2);

	}

}
