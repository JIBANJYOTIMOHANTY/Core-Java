public class Text3
{
	static int x;
	int y;

	Text3()
	{
		x++;
		y++;
		y = x++;
		call();
	}
	
	void call()
	{
		x += 5;
		y += 3;
		int x = 1;
		y = x++;
	}
	
	public static void display()
	{
		Text3 t = new Text3();
		t.x++;
		t.y++;
		System.out.println(t.x+"\t"+t.y);
	}

	{
		y++;
	}

	static
	{
		x += 10;
	}

	public static void main(String args[])
	{
		Text3 t1 = new Text3();
		t1.x++;
		t1.y++;
		display();
		System.out.println(t1.x+"\t"+t1.y);
	}
}