package Handling_Exceptions;

import java.util.Scanner;

public class Scanner_EH {

	public static void main(String[] args) {
		try {
			Scanner s1=new Scanner(System.in);
			int a=s1.nextInt();
			int c=1/a;
			System.out.println ("Result is "+c);
			
		}
		catch (Exception ext)
		{
			ext.printStackTrace();
		}
	}

}
