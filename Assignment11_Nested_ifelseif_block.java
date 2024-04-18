package basicsofjava;

public class Assignment11_Nested_ifelseif_block {
	
	public static void main (String[]args) {
		
		
		int a=2000;
		int b=4500;
		int c=3000;
		
		if (c==a){
		System.out.println("1");
		}
		else if(a<b){
			System.out.println("2");	
		}
		
		else if(c>a) {
			System.out.println("3");
		}
		else if(b>=c) {
			System.out.println("4");
		}
		else if(c!=a) {
			System.out.println("5");
			
		}
		else
			System.out.println("6");
		}
	}


