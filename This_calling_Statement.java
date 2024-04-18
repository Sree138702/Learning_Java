package basicsofjava_Arrays;
//Assignment65
public class This_calling_Statement 
{

	This_calling_Statement()
	{
		this (100);
		System.out.println("constructor1");
	}
	This_calling_Statement(int a)
	{
		this (35.44,55);
		System.out.println("constructor 2");
	}
	This_calling_Statement(double a, int b)
	{
		this ("Sree");
		System.out.println("constructor 3");
	}
	This_calling_Statement(String a)
	{
		this ('S');
		System.out.println("constructor 4");
	}
	This_calling_Statement(char c)
	{
		System.out.println("constructor5");
	}
	

	public static void main(String[] args) {
		This_calling_Statement t1= new This_calling_Statement();
	}

}
