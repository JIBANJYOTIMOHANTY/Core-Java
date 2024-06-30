class Demo
{
	public void display(String name)
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
public class Test2 extends Thread
{
	Demo dd;
	Test2(Demo dd, String name)
	{
		super(name);
		this.dd = dd;
		start();
	}
	public static void main(String args[])


	{
		Demo aa = new Demo();
		Test2 t1 = new Test2(aa,"First");
		Test2 t2 = new Test2(aa,"Second");
		Test2 t3 = new Test2(aa,"Third");
	}
	@Override
	public void run()
	{
		synchronized
		{
			dd.display(Thread.currentThread().getName());
		}
	}
}