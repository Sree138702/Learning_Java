package basicsofjava;

public class Assignment15_Calling_nonstatic_Method {
	void add() 
	{
	int a=5000;
	int b=9500;
	System.out.println(a+b);
	}

public static void main (String[]args)
{
	
	Assignment15_Calling_nonstatic_Method a1=new Assignment15_Calling_nonstatic_Method();
	a1.add();
}


}