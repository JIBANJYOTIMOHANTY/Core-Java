interface A
{
	int data = 44;
	void call();
	void show();
	void display();
}
interface B
{
	void fun();
}
public class Demo1 implements A,B
{
	@Override
	public void call()
	{
		System.out.println("Call method");
	}
	@Override
	public void show()
	{
		System.out.println("Show method");
	}
	@Override
	public void display()
	{
		System.out.println("Display method");
	}
	@Override
	public void fun()
	{
		System.out.println("Fun method");
	}
	public static void main(String args[])	
	{
		Demo1 dd = new Demo1();
		dd.call();
		dd.show();
		dd.display();
		dd.fun();
	}
}