package basicsofjava;
//Assignment 34

 class Super_Calling{ // Super calling statement with non parameterized super calling statement
	 Super_Calling()
	 {
		 System.out.println("parent constructor");
		 
	 }
 }
 
	 public class Child2 extends Super_Calling
	 {
		 
		 Child2()
		 { super ();
			 System.out.println("Child constructor");
			 
		 }
		 
		 public static void main(String[] args) {
			 new Child2();
		}
	 }
 
 
 
		
	

