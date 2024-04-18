package basicsofjava_Arrays;

public class Assignment47 {

	public static void main(String[] args) {
		String name1= "mango123";
		char c1[]=name1.toCharArray();
		for (int i=0; i<name1.length();i++)
		{
			boolean answer=Character.isDigit(c1[i]);
			if (answer==false) {
				System.out.println("index position "+i+ "is"+"alphabet");	
				
			}
			else {
				System.out.println("index position " +i+ "is "+"numeric");
			}
				
		}

	}

}
