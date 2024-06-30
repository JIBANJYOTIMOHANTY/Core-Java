interface A
{
	void show();
}
interface B
{
	void display();
}
public class Demo4
{
	public static void main(String args[])
	{
		A aa = new A()
		{
			@Override
			public void show()
			{
				System.out.println("show method");
			}
		};
		aa.show();
		B bb = new B()
		{
			@Override
			public void display()
			{
				System.out.println("display method");
			}
		};
		bb.display();
	}
}