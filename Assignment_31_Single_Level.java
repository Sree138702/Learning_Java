package basicsofjava;
class Parent_Class{
	 void mul(int a, int b) {
		System.out.println(a*b);
}
}


public class Assignment_31_Single_Level extends Parent_Class {
	
	static void add(int a,int b) {
		System.out.println(a+b);
	}
	
	static void div(int a,int b) {
		System.out.println(a/b);
	}
	
	public static void main(String[] args) {
		
		add(20,60);
		div(60,20);
		Parent_Class p1=new Parent_Class();
		p1.mul(40,20);
		
		
	}

}
