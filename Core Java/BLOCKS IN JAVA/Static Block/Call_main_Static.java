public class Call_main_Static
{
	public static void main(String args[])
	{
		System.out.println("I like India");
	}
	
	static
	{
		System.out.println("I am in the class block in static block.");
		main(new String[0]);
		System.out.println("I leave the class block.");
	}
}