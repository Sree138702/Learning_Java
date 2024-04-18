package basicsofjava;

 public class Super_Calling_Method {
	void parent(){
		System.out.println("parent"); 
	}
	public class Assignment34 extends Super_Calling_Method {
		void child()
		{
			super();
			System.out.println("child");
		}
		public static void main(String[] args) {
			Assignment34 =new Assignment34();
			System.out.println("main method");
		}
	}
	
	

}
