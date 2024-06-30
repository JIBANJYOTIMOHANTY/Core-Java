public class demo1
{
	private String name;
	private int Roll;
	private demo1()
	{
		System.out.println("Object is constructed.");
	}
	public void setName(String s)
	{
		name = s;
	}
	public void setRoll(int r)
	{
		Roll = r;
	}

	public String getName()
	{
		return name;
	}
	public int getRoll()
	{
		return Roll;
	}
	public static demo1 createObject()
	{
		return new demo1();
	}
}