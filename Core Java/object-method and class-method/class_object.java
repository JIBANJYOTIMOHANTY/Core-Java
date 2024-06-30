public class class_object
{
	static void m1()
	{
		System.out.println("Class method");
	}

	void m2()
	{
		System.out.println("Object method");
	}

	public static void main(String args[])
	{
		class_object c = new class_object();
		class_object.m1();
		c.m2();
	}
}