public class Text6
{
	public static void main(String args[])
	{
		c1:
		for(int i = 0; i < 3; i++)
		{
			c2:
			for(int j = 0; j < 3; j++)
			{
				if(i == j)
				{
					break c2;
				}
				System.out.println(i + "\t" + j);
			}
		}		
	}
}