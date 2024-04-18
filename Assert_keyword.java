package basicsofjava_Arrays;
//Assignment 63
public class Assert_keyword {

	public static void main(String[] args) {
		String name="sreeshubha";
		assert name.length()>20;//assert is false
		for(int i=0; i<name.length();i++)
		{
			System.out.println(name.concat(" Sree"));
		}
	}

}
