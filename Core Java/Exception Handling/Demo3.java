public class Demo3
{
	public static void main(String args[])
	{
		double d = -100;
		try
		{
			System.out.println("Result is : " + (d/args.length));
		}
		catch(Exception e)
		{
			System.out.println("Caught the Exception.");
		}
	}
}