public class Finalize_method
{
	Finalize_method()
	{
		System.out.println("Object is constructed.");
	}
	void call()
	{
		System.out.println("I am the call method");
	}
	@Override
	public void finalize()
	{
		System.out.println("please do not kill me.");
	}
	public static void display()
	{
		Finalize_method f2 = new Finalize_method();
		f2.call();
		f2 = null;
		
		Finalize_method f1 = new Finalize_method();
		f1.call();
		f1 = null;
	}
	public static void main(String args[])
	{
		System.out.println("Hello, Good Morning Java");
		display();
		System.gc();
		try
		{
			Thread.sleep(5000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}	
}







