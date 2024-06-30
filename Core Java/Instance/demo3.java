class X
{

}
class Y extends X
{

}
public class demo3
{
	public static void main(String args[])
	{
		X aa = new X();
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