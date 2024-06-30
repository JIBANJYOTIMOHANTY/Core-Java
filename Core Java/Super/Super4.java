class X
{
	int roll;
	X()
	{
		System.out.println("Object is constructed.");
	}
	X(int roll)
	{
		this.roll = roll;
	}
}
class Y extends X
{
	String name;
	double fee;
	Y(String name)
	{
		this(129.21);
		this.name = name;
	}
	Y(double fee)
	{
		super(125);
		this.fee = fee;
	}
	Y()
	{
		System.out.println("Hello");
	}
}
public class Super4
{
	public static void main(String args[])
	{
		Y aa = new Y("Jiban");
		System.out.println("Name is : "+ aa.name+"\nRoll is : " + aa.roll+"\nFee : " + aa.fee);
		Y bb = new Y();
		System.out.println("Name is : "+bb.name + "\nRoll is : " + bb.roll + "\nFee : " + bb.fee);
	}
}