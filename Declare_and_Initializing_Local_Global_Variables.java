package basicsofjava;
//Assignment 23
public class Declare_and_Initializing_Local_Global_Variables {

	
		static int number1=200;
		static int number2=100;
		
	     static void add() {
	    	 int sum=number1+number2;
	    	 System.out.println(sum);
	     }
	     static void subtract() {
	    	 int subtract=number1-number2;
	    	 System.out.println(subtract); 
	     }
	     static void multiply() {
	    	 int multiply=number1*number2;
	    	 System.out.println(multiply); 
	     }
	     static void division() {
	    	 int division=number1/number2;
	    	 System.out.println(division); 
	     }
	     static void modulas() {
	    	 int modulas=number1%number2;
	    	 System.out.println(modulas); 
	     }
	     public static void main(String[] args) {
		   add();
		   subtract();
		   multiply();
		   division();
		   modulas();
		 
		}

	}

	


