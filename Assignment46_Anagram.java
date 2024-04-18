package basicsofjava_Arrays;

import java.util.Arrays;

public class Assignment46_Anagram {

	public static void main(String[] args) {
		String name1="top";
		String name2="pot";
		
		if (name1.length()!=name2.length()){
			System.out.println("given string is not an anagram");
		}
		else {
			char n1[]=name1.toCharArray();
			char n2[]=name2.toCharArray();
			Arrays.sort(n1);
			Arrays.sort(n2);
			
			System.out.println(Arrays.toString(n1));
			System.out.println(Arrays.toString(n2));
			boolean answer=Arrays.equals(n1, n2);
			System.out.println(answer);
			
			if (answer==true) {
				System.out.println("given stringa are anagram");
			}
			else {
				System.out.println("given stringa are not anagram");
			}
		}
			

	}

}
