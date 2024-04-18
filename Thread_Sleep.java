package basicsofjava;

public class Thread_Sleep {

	public static void main(String[] args)throws InterruptedException
	{
		for (int i=1;i<=100;i++)
		{
			System.out.println(i);
			Thread.sleep(5000);
		}

	}

}
