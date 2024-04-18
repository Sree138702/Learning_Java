package basicsofjava_Arrays;

import java.util.Scanner;

public class Int_array_Scannerclass {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("enter the size of Array");
		int size =s1.nextInt();
		int []array=new int[size];
		System.out.println("the size of arrays: "+array.length);
	}

}
