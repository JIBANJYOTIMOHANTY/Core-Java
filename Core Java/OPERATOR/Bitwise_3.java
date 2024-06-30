public class Bitwise_3
{
	public static void main(String args[])
	{
		int x = 10, y = 20;
		if((x++ > 10) & (++y > 20))
		{
			x++;
			y++;
		}
		else
		{
			x++;
			y++;
		}
		System.out.println(x+"\t"+y);
	}
}