package basicsofjava_Arrays;

import java.util.Scanner;

//Assignment 52
public class Factorial_Numbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number");
		int s=sc.nextInt();
		
		int fact=1;
		for (int i=s;i>=1;i--)
		{
			fact=fact*i;
		}
		System.out.println("Factorial of a number:" +fact);
	}

}
//factorial number of 8= 40,320 (8*7*6*5*4*3*2*1)
