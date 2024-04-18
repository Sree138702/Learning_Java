package basicsofjava;
import java.util.Scanner;


public class Assignment30_Square {

	 static void Area_Square() {
			Scanner s1=new Scanner(System.in);
			double s=s1.nextDouble();
			double Area=s*s;
			System.out.println(Area);
			}
		
		static void Circumference_Square() {
			Scanner s1=new Scanner(System.in);
			double s=s1.nextDouble();
			 double Circumference=4*s;
			System.out.println(Circumference);
			}
		public static void main(String[] args) {
			Area_Square();
			Circumference_Square();
		}
}
