package basicsofjava;//Assignment 39
interface One{
	void mul();
	void sub();
	
}
interface two{
	
	void div();
	void add();
	
}
interface three {
	
	void mod();
	
}
interface four {
	void circle();
}
public class Multiple_Level_Inheritance implements One,two,three,four {

	
	public void circle() {
		System.out.println("Banglore");
	}

	
	public void mod() {
		
		System.out.println("Delhi");
	}

	
	public void div() {
		System.out.println("Mumbai");
	}

	
	public void add() {
		System.out.println("Hyderabad");
	

}


	
	public void mul() {
		System.out.println("Culcutta");
	}


	
	public void sub() {
		System.out.println("Pune");
		
		}
	public static void main(String[] args) {
		
		Multiple_Level_Inheritance m1=new Multiple_Level_Inheritance();
		m1.add();
		m1.mul();
		m1.circle();
		m1.div();
		m1.sub();
		m1.mod();
				
	}
	
}
