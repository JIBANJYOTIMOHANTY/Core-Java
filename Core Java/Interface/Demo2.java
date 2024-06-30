interface A
{
	void show();
}
interface B extends A
{
	void call();
}
public class Demo2 implements B
{
	@Override
	public void show()
	{
		System.out.println("show method");
	}
	@Override
	public void call()
	{
		System.out.println("call method");
	}
	public static void main(String args[])
	{
		A dd = new Demo2();
		dd.show();
		((B)dd).call();
	}
}