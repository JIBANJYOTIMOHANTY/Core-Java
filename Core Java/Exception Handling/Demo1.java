public class Demo1
{
	public static void main(String args[])
	{
		int x = 100;
		int y = args.length;
		try
		{
			System.out.println("Result is : " + (x/y));
		}
		catch(Exception e)
		{
			System.out.println("Reason of the exception is : " + e.getMessage() + "\n");

			e.printStackTrace();

			System.out.println("\n"+e);
		}
	}
}