package basicsofjava;
import java.util.*;
public class Scanner_Class {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("enter the value of no1");
		int no1= s1.nextInt();
		System.out.println("enter the value of no2");
		 byte no2=s1.nextByte();
		 System.out.println("enter the value of no3");
		short no3=s1.nextShort();
		System.out.println("enter the value of no4");
		long no4=s1.nextLong();
		
	}
}
