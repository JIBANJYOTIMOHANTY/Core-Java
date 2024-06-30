public class Demo implements Runnable
{
	public static void main(String args[])
	{
		Demo dd = new Demo();
		Thread t1 = new Thread(dd,"First");
		Thread t2 = new Thread(dd,"Second");
		Thread t3 = new Thread(dd,"Third");
		t1.setPriority(10);
		t2.setPriority(5);
		t3.setPriority(2);
		t1.start();
		t2.start();
		t3.start();
	}
	public void run()
	{
		try
		{
			Thread.sleep(1000);
		}
		catch(InterruptedException ie)
		{
			
		}
		System.out.println("Running Thread name is : "+ Thread.currentThread().getName());
	}
}