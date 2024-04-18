package basicsofjava;
//Assignment30
import java.util.Scanner;

public class Assignment30_Circumference_circle {
	final static double pi=3.14;
	
	static void Circumference_Circle() {
		Scanner s1=new Scanner(System.in);
		double r=s1.nextDouble();
		double Circumferance=2*pi*r;
		System.out.println(Circumferance);
		
		
	}
	
	static void Area_Circle() {
		Scanner s1=new Scanner(System.in);
		double r=s1.nextDouble();
		double Area=pi*r*r;
		System.out.println(Area);
	}
	public static void main(String[] args) {
		Circumference_Circle();
		Area_Circle();
	}
	

}
