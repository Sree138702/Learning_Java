package basicsofjava;


import java.util.Scanner;

public class Assignment30_Triangle_Area {
	
	static void Area_Triangle() {
		Scanner s1=new Scanner(System.in);
		double h=s1.nextDouble();
		double b=s1.nextDouble();
		double Area=h*b/2;
		System.out.println(Area);
		}
	
	static void Circumference_Triangle() {
		Scanner s1=new Scanner(System.in);
		double a=s1.nextDouble();
		double b=s1.nextDouble();
		double c=s1.nextDouble();
		 double Circumference=a+b+c;
		System.out.println(Circumference);
		}
	
	public static void main(String[] args) {
		Area_Triangle();
		Circumference_Triangle();
		
		
	}
}
