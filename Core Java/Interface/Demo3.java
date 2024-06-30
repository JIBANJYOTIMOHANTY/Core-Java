interface A
{
	void call();
}
interface B
{
	void show();
}
public class Demo3 implements A,B
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
	public static void main(String args[])
	{
		A aa = new Demo3();
		aa.call();
		B bb = new Demo3();
		bb.show();
	}
}