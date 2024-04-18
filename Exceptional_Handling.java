package Handling_Exceptions;

public class Exceptional_Handling {

	public static void main(String[] args) {
		int c=1/0;
		try
		{
			System.out.println(c);
		}
		catch (ArithmeticException a1) 
		{
		
      System.out.println("handled the Exeception,please continue...");
	}
}
}