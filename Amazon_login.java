package basicsofjava;
class Getter_Setter

{
	
	private int age=20;
	private String un="studentinfo@gmail.com";
	private String pwd="Sree1234$";
	private int otp=123;
	public void setage(int age)
	{
		this.age=age;
	}
	public int getage()
	{
		return age; //if we want the get the set value we can use return keyword (void will have to change to return type
	}
	public void setun(String username)
	{
		this.un=username;
		
	}
	public String getun() {
		return un;
	}
	public void setpwd(String password)
	{
		this.pwd=password;
	}
	public String getpwd() {
		return pwd;
		
	}
	public void setotp(int otp) {
		this.otp=otp;
		
	}
	public int getotp()
	{
		return otp;
		
	}
}
	
public class Amazon_login {
	



	public static void main(String[] args) {
		Getter_Setter a1=new Getter_Setter();
		a1.setage(86);
		System.out.println(a1.getage());
		a1.setun("sreeshubha.c@gmail.com");
		System.out.println(a1.getun());
		a1.setpwd("earth@123");
		System.out.println(a1.getpwd());
	    a1.setotp(2345);
	    System.out.println(a1.getotp());
	}
		

	

}

