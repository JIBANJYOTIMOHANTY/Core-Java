class X
{
	public String getMessage(String message)
	{
		System.out.println("I am in base class");
		return message;
	}
}

class Y extends X
{
	public String getMessage(String s)
	{
		System.out.println("I am in child class");
		return s;
	}
}
public class Demo
{
	public static void main(String args[])
	{
		Y aa = new Y();
		System.out.println(aa.getMessage("Hello"));
	}
}