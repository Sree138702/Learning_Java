package basicsofjava;//Assignment 36

public class This_Keyword {
	int a;
	public This_Keyword(int a) {
		this.a=a;
	}

	public static void main(String[] args) {
		int a=100;
		This_Keyword b=new This_Keyword(200);
		System.out.println(a);
		System.out.println(b.a);
		
	}

}
