package basicsofjava;//Assignment 41


public class String_Name_And_Palindrome {
	public static void main(String[] args) {
		String name="Sreeshubha Chakravarthula";
		String reverse="";
		for (int i=name.length()-1;i>=0;i--) {
			char answer=name.charAt(i);
			
			reverse=reverse+answer;
			System.out.print(answer);
			
		}
		boolean a1=name.equals(reverse);
		System.out.println(a1);
		if (a1==true) {
			System.out.println("the input is palindrome");
		}
		else {
			System.out.println("the input is not palindrome");
		}
	}

}
