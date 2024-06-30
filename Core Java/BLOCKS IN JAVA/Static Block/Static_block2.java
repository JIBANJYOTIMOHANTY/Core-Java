class X
{
	static
	{
		System.out.println("Hello");
	}
}
public class Static_block2
{
	static int data;
	
	public static void main(String args[])
	{
		System.out.println("I am in the main");
		data *= 2;
		System.out.println("Data : " + data);
	}
	static
	{
		data += 5;
		System.out.println("I am in the static block or class block.");
		System.out.println("Data : " + data);
	}
}