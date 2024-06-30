abstract class X
{
	void call()
	{
		System.out.println("Object method");
	}
	static void show()
	{
		System.out.println("Class method");
	}
	X()
	{
		System.out.println("Object is constructed.");
	}
	String name;
	public abstract void setName(String name);
	public abstract String getName();
}
public class Demo1 extends X
{
	@Override
	public void setName(String name)
	{
		this.name = name;
	}
	@Override
	public String getName()
	{
		return this.name;
	}
	public static void main(String args[])
	{
		X dd = new Demo1();
		dd.call();
		dd.setName("Jiban");
		dd.show();
		System.out.print("Name is : " + dd.getName());
		//new X();
		
	}
}