package basicsofjava_Arrays;
//Assignment 44
import java.util.Scanner;

public class Array_Int3_Scannerclass {

	public static void main(String[] args) {
		Scanner s1= new Scanner(System.in);
		int [] array= new int[3];
		int s=array.length;
		
		for (int i=0; i<s; i++)
		{
			System.out.println("Enter the value");
			array[i]=s1.nextInt();
		}
		for (int i=0; i<s; i++)
		{
			System.out.println(array[i]);
		}
		

	}

}
