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
public class Test extends Thread
{
	Demo dd;
	Test(Demo dd, String name)
	{
		super(name);
		this.dd = dd;
		start();
	}
	public static void main(String args[])
	{
		Demo aa = new Demo();
		Test t1 = new Test(aa,"First");
		Test t2 = new Test(aa,"Second");
		Test t3 = new Test(aa,"Third");
	}
	@Override
	public void run()
	{
		dd.display(Thread.currentThread().getName());
	}
}