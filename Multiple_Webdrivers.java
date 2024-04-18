package basicsofjava;

public class Multiple_Webdrivers {

	//public static void main(String[] args) {
		WebDriver driver;
		@Test
		public void testcase1() {
			switch (2) {
			case 1: 
			{
				System.out.println("Google Chrome Launch");
				 driver=new ChromeDriver();
				break;
			}
			case 2: 
			{
				System.out.println("Firefox browser Launch");
				 driver=new FirefoxDriver();
				break;

			}
			case 3: 
			{
				System.out.println("Edge browser Launch");			
				driver=new EdgeDriver();
				break;
			}
			default:
				System.out.println("The selection you have made is wrong");

			}

	}

}
