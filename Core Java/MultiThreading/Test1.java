class Demo
{
	public synchronized void display(String name)
	{
		System.out.println("Running Thread name is " + name);
		try
		{
			Thread.sleep(1000);
		}
		catch(InterruptedException ie)
		{

		}
		System.out.println("Dead Thread name is : " + name);
	}

}
public class Test1 extends Thread
{
	Demo dd;
	Test1(Demo dd, String name)
	{
		super(name);
		this.dd = dd;
		start();
	}
	public static void main(String args[])
	{
		Demo aa = new Demo();
		Test1 t1 = new Test1(aa,"First");
		Test1 t2 = new Test1(aa,"Second");
		Test1 t3 = new Test1(aa,"Third");
	}
	@Override
	public void run()
	{
		dd.display(Thread.currentThread().getName());	
	}
}