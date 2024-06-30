public class demo1
{
	int data;
	private class Inner1
	{
		void increment()
		{
			data++;
		}
	}
	
	void call()
	{
		Inner1 ii = new Inner1();
		ii.increment();
		ii.increment();
		ii.increment();
		ii.increment();
		ii.increment();
		System.out.println("Data value for inner class is : " + data);
	}
	public static void main(String args[])
	{
		demo1 dd = new demo1();
		dd.call();
		System.out.println("Data value of outer class is : " + dd.data);
	}
}