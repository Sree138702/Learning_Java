package basicsofjava;

public class Assignment16 {
public static void main(String[] args) 
{
	
	char gender='M';
	 int age=20;
	
	if(gender=='M'&& age>18)
	{
		System.out.println("he is eligible to vote");
	}
	
	else
		if(gender=='F' && age>18)
		{
			System.out.println("She is eligible to vote");
		}
		
		else
		{ System.out.println("person is not eligible to vote");
	 
	}
	
	

}}

