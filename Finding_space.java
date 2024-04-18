package basicsofjava_Arrays;

public class Finding_space {
	public static void main(String[] args) {
		String name= "sree shubha sree";
		char c1[]=name.toCharArray();
		int count_of_space=0;
		
		
		for (int i=0;i<name.length();i++)
		{
			
			boolean answer = Character.isSpaceChar(c1[i]);
		if(answer==true)
		{
			count_of_space++;
			
			//System.out.println("there is space in the given string "+count_of_space );
			
			}
		//System.out.println("there is space in the given string "+count_of_space );
		}
		//if(count_of_space==0)
			//System.out.println("there is no space in the given string");
		System.out.println("there is space in the given string "+count_of_space );
		
	}
	}


