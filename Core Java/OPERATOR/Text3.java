public class Text1
{
	public static void main(String args[])
	{
		int x = 0;
		for(int i = 1; i <= 3; i++)
		{
			do
			{
				System.out.println(i);
			}while(x++<3);
		}
		System.out.println(x);
	}
}