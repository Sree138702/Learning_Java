package basicsofjava;

public class Area_Of_Trapegium {
	static int a=62;
	static int b=34;
	static int c=45;
	static int d=65;
	static int h=26;
	
	public static void main(String[] args) {
		int Area_of_trapegium=(a=b)*h/2;
		System.out.println( Area_of_trapegium);
		
		int Circumference_of_trapegium= a*b+b*c+c*d+a*d;
		System.out.println(Circumference_of_trapegium);
	}

}
