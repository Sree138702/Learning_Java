package basicsofjava;
//Assignment42
import java.util.Date;

public class FutureDate_FutureTime {

	public static void main(String[] args) {
		Date d2= new Date();
		System.out.println(d2.getTime());
		Date d3=new Date (d2.getTime()+(1000*60*60*24*10));
		System.out.println(d3);
		//to find the future time
		
		Date d4=new Date(d2.getTime()-(1000*60*60*24*10));
		System.out.println(d4);
		// to find past time
		
		
	}

}
