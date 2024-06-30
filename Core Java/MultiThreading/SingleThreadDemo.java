class X
{
	void call1()
	{
		for(int i = 1; i <= 5; i++)
		{
			System.out.print(i + "\t");
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException ie)
			{
				System.out.println("Exception Handled");
			}
		}

	}
	void call2()
	{
		for(int i = 5; i >= 1; i--)
		{
			System.out.print(i + "\t");
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException ie)
			{
				System.out.println("Exception Handled");
			}
		}
	}
}
public class SingleThreadDemo
{
	public static void main(String args[])
	{
		X aa = new X();
		long time1 = System.currentTimeMillis();
		aa.call1();
		System.out.println("\n");
		aa.call2();
		long time2 = System.currentTimeMillis();
		System.out.println("\n\nTotal time consumed to execute the program is : " + ((time2 - time1)/1000) + "Seconds.\n");
	}
}