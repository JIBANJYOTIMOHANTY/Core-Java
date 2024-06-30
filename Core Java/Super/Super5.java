class Base
{
	int data;
	public void increment()	
	{
		data ++;		
	}
}
class Child extends Base
{
	@Override
	public void increment()
	{
		data += 5;
	}
	void call()
	{
		increment();
		System.out.println("Before calling super() : " + data);
		super.increment();
		System.out.println("After  calling super() : " + data);
	}
}
public class Super5
{
	public static void main(String args[])
	{
		Child c = new Child();
		c.call();
	}
}