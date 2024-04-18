package basicsofjava;
//Assignment 29
import java.util.Scanner;

public class Scanner_Local_Variable {
	static void add() {
		
	
	Scanner s1=new Scanner (System.in);
	int a=s1.nextInt();
	int b=s1.nextInt();
	System.out.println(a+b);
	}
	
	static void sub() {
		Scanner s1=new Scanner(System.in);
		int a=s1.nextInt();
		int b=s1.nextInt();
		System.out.println(a-b);
	}
	
	void multi() {
		Scanner s1=new Scanner(System.in);
		int a=s1.nextInt();
		int b=s1.nextInt();
		System.out.println(a*b);
		
	}
	void div() {
		Scanner s1=new Scanner(System.in);
		int a=s1.nextInt();
		int b=s1.nextInt();
		System.out.println(a/b);
	}
	void modu() {
		Scanner s1=new Scanner(System.in);
		int a=s1.nextInt();
		int b=s1.nextInt();
		System.out.println(a%b);
	}
	

	public static void main(String[] args) {
		
		Scanner_Local_Variable n1=new Scanner_Local_Variable ();
		n1.multi();
		n1.div();
		n1.modu();
		add();
		sub();
		
		
		
		
		
	}
}

