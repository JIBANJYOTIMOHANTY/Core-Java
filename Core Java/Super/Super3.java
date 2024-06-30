class X
{
	String name;
	X(String name)
	{
		this.name = name;
	}
}
class Y extends X
{
	int roll;
	Y()
	{
		super("Jiban");
		roll = 24;
	}
	Y(int roll)
	{
		super("Jyoti");
		this.roll = roll;
	}
}
public class Super3
{
	public static void main(String args[])
	{
		Y aa = new Y();
		System.out.println("Name is : "+ aa.name+"\nRoll is : " + aa.roll);
		Y bb = new Y(48);
		System.out.println("Name is : "+bb.name + "\nRoll is : " + bb.roll);
	}
}