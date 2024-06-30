public class Static_Block
{
	static int data;
	static
	{
		data += 10;
		System.out.println("I am in the first static block or class block.");
		System.out.println("Data : " + data);
	}
	public static void main(String args[])
	{
		System.out.println("I am in the main");
		data *= 2;
		System.out.println("Data : " + data);
	}
	static
	{
		data *= 5;
		System.out.println("I am in the second static block or class block.");
		System.out.println("Data : " + data);
	}
}