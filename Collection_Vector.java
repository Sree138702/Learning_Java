package basicsofjava;

import java.util.Vector;

public class Collection_Vector {

	public static void main(String[] args) {
		Vector v1=new Vector();
		v1.add(3500);
		v1.add(650);
		v1.add(650);//accepting repated int values
		v1.add(35.65);
		v1.add(false);
		v1.add(false);
		v1.add("null");
		v1.add("you");
		v1.add('K');
		System.out.println(v1);
		
		Vector v2=new Vector();
		v2.add(300);
		v2.add(6050);
		v2.add(650);
		v2.add(650);
		v2.add(35.65);
		v2.add(true);
		v2.add(false);
		v2.add("null");
		v2.add("me");
		v2.add('P');
		v1.add("you");
		v1.add('K');//not accepting repeated char values
		System.out.println(v2);
		
	}

}
