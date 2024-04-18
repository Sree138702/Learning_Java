package basicsofjava_Arrays;

public class Array_finding_Average {

	public static void main(String[] args) {
		int array[]=new int[5];
		array[0]=36;
		array[1]=69;
		array[2]=15;
		array[3]=45;
		array[4]=26;
		
		double average=(array[0]+array[1]+array[2]+array[3]+array[4])/array.length;
		System.out.println(average);
		
		for (int i=0;i<=4;i++)
		{
			average=average+array[i];
			System.out.println();
		}
	
	}

}
