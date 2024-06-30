abstract class X
{
	public abstract void show();
	public abstract void call();
	public abstract void display();
}
abstract class Y extends X
{
	@Override
	public void show()
	{
		System.out.println("Show method");
	}
}
abstract class Z extends Y
{
	@Override
	public void call()
	{
		System.out.println("Call method");
	}
}
public class Demo3 extends Z
{
	@Override
	public void display()
	{
		System.out.println("Display method");
	}
	public static void main(String args[])
	{
		Demo3 dd = new Demo3();
		dd.show();
		dd.call();
		dd.display();
	}
}