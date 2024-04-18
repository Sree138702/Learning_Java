package basicsofjava;

public class Myconstructor { //Assignment 17
	static void add() {
		System.out.println("Method1");}
		
	static void mul() {
		System.out.println("Method2");}
		
			void div() {
				System.out.println("Method3");}
			
			void sub() {
					System.out.println("Method4");}
			Myconstructor(){
				System.out.println("Method5");
			}
		 
		public static void main(String[] args) {
	
		Myconstructor m1=new Myconstructor();
		m1.div();
		m1.sub();
		add();
		mul();
		Myconstructor m2= new Myconstructor();
		
		
	}
	
	
}

