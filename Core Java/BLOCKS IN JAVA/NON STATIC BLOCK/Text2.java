public class Text2
{
	int data;
	Text2()
	{
		data++;
		System.out.println("Object is constructed.");
	}
	
	{
		data += 5;
		System.out.println("Object Block.");
	}

	void call()
	{
		data++;
		System.out.println("Object method.");
	}

	{
		data += 7;
		System.out.println("Second Object Block.");
	}

	public static void main(String args[])
	{
		Text2 t = new Text2();
		t.call();
		System.out.println("Data value for the object is : " + t.data);
		Text2 t1 = new Text2();
		t1.call();
		t1.call();
		t1.call();
		t1.call();
		System.out.println("Data value for the object is : " + t1.data);
	}
}