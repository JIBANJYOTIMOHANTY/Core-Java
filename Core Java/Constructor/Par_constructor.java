public class Par_constructor
{
	int data;
	Par_constructor(int x)
	{
		data = x;
	}
	public static void main(String args[])
	{
		Par_constructor n = new Par_constructor(109);
		System.out.println("data value is : " + n.data);
	}
	private Par_constructor()
	{
		data++;	
	}
}