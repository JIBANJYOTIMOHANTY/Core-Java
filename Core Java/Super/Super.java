class X
{
	int data;
}
class Y extends X
{
	int data;
	void setData(int x, int y)
	{
		super.data = x;
		data = y;
	}
	void display()
	{
		System.out.println("Base class member is : " + super.data);
		System.out.println("Child class member is : " + data);
	}
}
public class Super
{
	public static void main(String args[])
	{
		Y yy = new Y();
		yy.setData(12,65);
		yy.display();
	}
}