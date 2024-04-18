package basicsofjava;
//Assignment 32
public class Child_Class1_Multi extends Parent_Class_Multi {
	static void add() {
		System.out.println("Child_Class1");
	}

	public static void main(String[] args) {
		add();
		div();
		multi();
		
		Parent_Class_Multi p1=new Parent_Class_Multi();
		p1.Sub();
	}

}
