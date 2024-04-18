package basicsofjava;
import java.util.Scanner;

public class Assignment30_Rectangle {
	
        static void Area_Rectangle() {
			Scanner s1=new Scanner(System.in);
			double w=s1.nextDouble();
			double l=s1.nextDouble();
			double Area=w*l;
			System.out.println(Area);
			}
		
		static void Circumference_Rectangle() {
			Scanner s1=new Scanner(System.in);
			double w=s1.nextDouble();
			double l=s1.nextDouble();
			 double Circumference=2*l+2*w;
			System.out.println(Circumference);
			}
		public static void main(String[] args) {
			Area_Rectangle();
			Circumference_Rectangle();

}
}
