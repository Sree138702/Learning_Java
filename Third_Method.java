package basicsofjava;



 abstract class Assignment_37 {
	 
		 abstract void method1();
			
		    abstract void method2();
 
	
 
      void method3()
    	  {
      
    	System.out.println("123"); 
      }
      
     
    	static void method4()
    		{
    	System.out.println("456");	
    	}
    	}
 abstract class Second_Method extends Assignment_37 { 
	 abstract void method5();
	 abstract void method6();
	 
	 static void method7() 
		 {
	 
		 System.out.println("789");
	 }
	  
		  static void method8() 
			  {
		  
			 System.out.println("912");
		  }
		  }
		 public class Third_Method extends Second_Method   {
			 static void method9()
			 
			 {
				 System.out.println("345");
			 }
			 
		 public class Fourth_Method extends Third_Method {
			 
			 static void method10()
			 {
				 System.out.println("this is fun");
			 }
		 
		 
			void method5() {
				System.out.println("you");
				
			}

			
			void method6() {
				System.out.println("me");
			}

			
			void method1() {
				System.out.println("they");
				
			}

			
			void method2() {
				System.out.println("it");
				
			}
		 
 
 public static void main(String[] args) {
method4();
method7();
method8();
method9();
method10();
Third_Method m1=new Third_Method();
m1.method3();
m1.method5();
m1.method6();
m1.method1();
m1.method2();
/*Fourth_Method m2= new Fourth_Method();
m2.method5();
m2.method6();
m2.method1();
m2.method2();*/

}
 }
		 
		
		void method5() {
			System.out.println("hello");
			
		}

		
		void method6() {
			System.out.println("hi");
			
		}

		
		void method1() {
			System.out.println("good");
		}

		
		void method2() {
			System.out.println("bye");
		}
		}
		 
 
			 

			
			

			
			
		 
		 
	 
		 
 
 
		 
		 
		 
		 
	 
	 
 
 
 
	
