package basicsofjava;
//assignment 56
public class Int_to_Double {

	public static void main(String[] args) {
		double weight=50; //we have converted int data type into double data type in implicit way.
		System.out.println(weight);
		
		weight =98.40;// implicit way
		
		double weight1=(double)90; //widening in explicit way
		System.out.println(weight1);
		
		byte a1=50; //widening byte to int data type
		int a2=a1;System.out.println(a2);
	}

}
