package basicsofjava;
import java.util.*;//Assignment 27
public class Assignment_Scanner_Class {
	static int no1;
	static int no2;
	static void add() {
		System.out.println(no1+no2);
		
		
	
	}
	static void sub() {
		
		System.out.println(no1-no2);
	}
	
	static void mul() {
		
		System.out.println(no1*no2);
	}
	
	static void div() {
		System.out.println(no1/no2);
	}
	static void mod() {
		
		System.out.println(no1%no2);
	}
	
	public static void main (String[]args) {
		Scanner s1=new Scanner(System.in);
		no1=s1.nextInt();
		no2=s1.nextInt();
		add();
		sub();
		mul();
		div();
		mod();
		
}
}
