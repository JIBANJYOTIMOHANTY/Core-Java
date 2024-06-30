class Base 
{
	int x;
}
class Child extends Base
{
	int y;
	public static Base createObject()
	{
		Child c = new Child();
		c.x += 5;
		c.y += 10;
		System.out.println(c.x +"\t" + c.y);
		return c ;
	}
	public static Base createObject1()
	{
		Base b = new Base();
		b.x += 20;
		System.out.println(b.x + "\t" );
		return b;
	}
}
public class demo4
{
	public static void main(String args[])
	{
		Child cc = new Child();
		// System.out.println(cc.createObject1());
		cc.createObject();
		cc.createObject1();
		System.out.println(cc.x+"\t"+cc.y);
		Child c2 = (Child) Child.createObject1();
	}
}