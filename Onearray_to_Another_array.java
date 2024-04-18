package basicsofjava_Arrays;

import java.util.Arrays;

public class Onearray_to_Another_array {

	public static void main(String[] args) {
		int array1[]=new int[4];
		array1[0]=67;
		array1[1]=78;
		array1[2]=95;
		array1[3]=13;
		int array2[]=new int[array1.length];
		for (int i=0;i<4;i++)
		{
			array2[i]=array1[i];
		}
		System.out.println(Arrays.toString(array2));
		System.out.println(Arrays.toString(array1));
	}
	
	

}
