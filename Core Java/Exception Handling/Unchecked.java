public class Unchecked
{
	public static void main(String args[])
	{
		int x = 100;
		int y = 0;
		try
		{
			System.out.println("Result is : " + (x/y));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}