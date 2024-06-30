public class Text7
{
	public static void main(String args[])
	{
		System.out.println("1st loop execution starts from here ---->");
		c1:
		for(int i = 1; i <= 3; i++)
		{
			c2:
			for(int j = 1; j <= 3; j++)
			{
				if(i == j)
				{
					break c2;
				}
				System.out.println(i+"\t"+j);
			}
		}
		System.out.println("2nd loop execution starts from here ---->");
		c1:
		for(int k = 1; k <= 3; k++)
		{
			c2:
			for(int l = 1; l <= 3; l++)
			{
					if(k == l)
					{
						break c2;
					}
				System.out.println(k+"\t"+l);
			}
		}
	}
}