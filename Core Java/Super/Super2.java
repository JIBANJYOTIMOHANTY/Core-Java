class X
{
	int data;
}
class Y extends X
{
	int data = 10;
	int data2 = super.data;
}
class Z extends Y
{
	int data = 100;
	void display()
	{
		System.out.println(data);
		System.out.println(super.data);
		System.out.println(data2);
	}
}
public class Super2
{
	public static void main(String args[])
	{
		Z aa = new Z();
		aa.display();
	}
}