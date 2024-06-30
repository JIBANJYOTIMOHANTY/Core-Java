public class Non_par_constructor
{
	int data;
	Non_par_constructor(int x)
	{
		data = x;
	}
	public static void main(String args[])
	{
		Non_par_constructor n = new Non_par_constructor();
		System.out.println("data value is : " + n.data);
	}
	private Non_par_constructor()
	{
		data++;	
	}
}