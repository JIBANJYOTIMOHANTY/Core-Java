public class Checked
{
	static void display()
	{
		System.out.println("Checked Exception");
		try
		{
			throw new Exception();
		}
		catch(Exception e)
		{
			System.out.println("Caught Exception Object");
		}
		System.out.println("Method is Exception free");
	}
	static void show() throws Exception
	{
		System.out.println("Hello Jtan's");
		throw new Exception();
	}
	public static void main(String args[])
	{
		display();
		try
		{
			show();
		}
		catch(Exception e)
		{
			System.out.println("Handled Exception at calling time");
		}
	}
}