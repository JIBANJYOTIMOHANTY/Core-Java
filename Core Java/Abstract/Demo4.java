abstract class X
{
	int data;
	X(int data)
	{
		this.data = data;
	}
	public abstract int getData();
}
public class Demo4 extends X
{
	Demo4()
	{
		super(20);
	}
	@Override
	public int getData()
	{
		return data;
	}
	public static void main(String args[])	
	{
		Demo4 dd = new Demo4();
		System.out.println("Value = " + dd.getData());
	}
}