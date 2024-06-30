public class JoinDemo implements Runnable
{
	public static void main(String args[])
	{
		System.out.print("I");
		System.out.print(" Love ");
		JoinDemo jd = new JoinDemo();
		Thread t1 = new Thread(jd);	
		t1.start();
		try
		{
			t1.join();
		}
		catch(InterruptedException e)
		{
		
		}
		Thread t2 = new Thread(jd);	
		t2.start();
		try
		{
			t2.join();
		}
		catch(InterruptedException e)
		{
		
		}
		System.out.print(" Java ");
		System.out.println(" Technocrat " );
	}
	@Override
	public void run()
	{
		for(int i = 1; i <= 5; i++)
		{
			System.out.print(i + "  ");
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
		
			}

		}
		
	}
	
}