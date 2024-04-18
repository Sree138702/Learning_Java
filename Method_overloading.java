package basicsofjava;

//Assignment 18
public class Method_overloading {

	static void div() {
	System.out.println("model1");}
	
	static void div(String a,char b) {
	System.out.println("model2");}
	
	static void div(char a,double b,int c) {
	System.out.println("model3");}
	
	static void div(int d) {
		System.out.println("model4");}
		
		void div(int e,boolean a) {
			System.out.println("model5");}
		
		void div(String a, double b) {
			System.out.println("model6");}
		
		void div(boolean c) {
			System.out.println("model7");}
		
		void div(boolean c, String d){
			System.out.println("model8");}
		
			
		public static void main (String[]args) {
		
		
		div();
		div("sree", 'S');
		div('s',13.02, 8719);
		div(1707);
		
		Method_overloading m1= new Method_overloading();
		m1.div(230,false);
		m1.div("Me",1755.650);
		m1.div(true);
		m1.div(true,"You");}
		
		
		
		
		}
	
	

