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
public class MultiThreadDemo extends Thread
{
	static X bb = new X();
	@Override
	public void run()
	{
		bb.call2();
	}
	public static void main(String args[])
	{
		MultiThreadDemo aa = new MultiThreadDemo(); //-->User defined Thread		System.out.println();
		long time1 = System.currentTimeMillis();
		aa.start();//user defined thread got life.
		//After thread got life then Thread Schedular call run method which is Override.
		bb.call1(); //call1() method is call by main thread.  main thread managed by JVM.
		System.out.println("\n");
		long time2 = System.currentTimeMillis();
		System.out.println("\n\nTotal time consumed to execute the program is : " + ((time2 - time1)/1000) + "Seconds.\n");
	}
}