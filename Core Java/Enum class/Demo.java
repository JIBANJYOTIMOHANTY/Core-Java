enum Color
{
	RED ,BLUE,GREEN;
	int a = 0;
}
public class Demo
{
	public static void main(String args[])
	{
		//c.a = 45;
		Color c = Color.RED;
		System.out.println(Color.RED);
		System.out.println(c + "\nIndex : " + c.ordinal());
		Color c1[] = Color.values();
		System.out.println(c1);
		for(Color c2 : c1)
		{
			System.out.print(c2 + "\t");
		}
		System.out.println(c.a);
	}	
}