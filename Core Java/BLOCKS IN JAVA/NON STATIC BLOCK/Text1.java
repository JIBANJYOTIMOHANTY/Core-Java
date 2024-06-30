public class Text1
{
	Text1()
	{
		System.out.println("Object is constructed.");
	}
	public static void Show()
	{
		System.out.println("I am in class method.");
	}
	public void fun()
	{
		System.out.println("I am in object method.");
	}
	{
		System.out.println("Object Block");
	}
	public static void main(String args[])
	{
		System.out.println("I am in main method.");
		Show();
		new Text1().fun();
		System.out.println("I quit main method.");		
	}
	static
	{
		System.out.println("I am in class block.");
	}
}