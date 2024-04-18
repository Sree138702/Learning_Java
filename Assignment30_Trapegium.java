package basicsofjava;

import java.util.Scanner;

public class Assignment30_Trapegium {
	static void Area_Trapegium() {
		Scanner s1=new Scanner(System.in);
		double a=s1.nextDouble();
		double b=s1.nextDouble();
		double h=s1.nextDouble();
		double Area=((a+b)*h)/2;
		System.out.println(Area);
		}
	
	static void Circumference_Trapegium() {
		Scanner s1=new Scanner(System.in);
		double a=s1.nextDouble();
		double b=s1.nextDouble();
		double c=s1.nextDouble();
		double d=s1.nextDouble();
		 double Circumference=a*b+b*c+c*d+a*d;
		System.out.println(Circumference);
		}
	public static void main(String[] args) {
		Area_Trapegium();
		Circumference_Trapegium();
	}

}
