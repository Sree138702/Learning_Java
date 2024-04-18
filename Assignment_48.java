package basicsofjava_Arrays;

public class Assignment_48 {

	public static void main(String[] args) {
		
			String name ="mango";
			char c1[]=name.toCharArray();
			int count_of_Alpha=0;
			int count_of_numeric=0;
			
			
			for (int i=0; i<=name.length()-1;i++)
			{
				boolean answer= Character.isAlphabetic(c1[i]);
			boolean answer1=  Character.isDigit(c1[i]);
			
			if (answer==true)
			{
				count_of_Alpha++;
			}
			if (answer1==true)
			{
				count_of_numeric++;
			}
			
			}
				
	System.out.println("count of alphabet is in given string is:"+count_of_Alpha);
   System.out.println("count of numeric is in given string is:"+count_of_numeric);
					
			
			

	}
	}


