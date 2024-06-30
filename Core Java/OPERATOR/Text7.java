public class Text7
{
	public static void main(String args[])
	{
		c1:
		for(int i = 1; i <= 3; i++)
		{
			c2:
			for(int j = 1; j <= 3; j++)
			{
				if(i == j)
				{
					break;
				}
				System.out.println(i+"\t"+j);
			}
		}
	}
}