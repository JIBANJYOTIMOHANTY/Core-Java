public class Class_For_Name
{
	public static void main(String args[])
	{
		try
		{
			System.out.println("I am in the main.");
			System.out.println("Explicitly load the A.class in JVM occupied memory space");
			Class.forName("p1.A");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("I quit the main");
	}
}