class X
{

}
class Y extends X
{

}
public class demo2
{
	public static void main(String args[])
	{
		Y aa = new Y();
		if(aa instanceof Object)
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
		if(aa instanceof Y)
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
	}
}