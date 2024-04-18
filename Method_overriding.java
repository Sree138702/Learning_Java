package basicsofjava;//Assignment 35

public class Method_overriding {
	
	
		void you ()
		{
			System.out.println("you are so beautiful");
	    }

		public class Assignment35 extends Method_overriding{
			void you()
			{
				System.out.println("you are intelligent");
			}
		}

	public static void main(String[] args) {
		
		Assignment35 a=new Assignment35();
		a.you();
	}
}


