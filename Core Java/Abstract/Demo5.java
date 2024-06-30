abstract class X
{
	public abstract void show();
}
abstract class Y extends X
{
	public abstract void call();
}
public class Demo5 extends Y
{
	@Override
	public void show()
	{
		System.out.println("Show method");
	}
	@Override
	public void call()
	{
		System.out.println("Call method");
	}
	public static void main(String args[])
	{
		Demo5 dd = new Demo5();
		dd.show();
		dd.call();
	}
}