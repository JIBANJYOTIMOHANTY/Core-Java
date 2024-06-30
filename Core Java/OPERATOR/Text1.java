public class Text1
{
	public static void main(String args[])
	{
		int x = 0, y = 9;
		do
		{
			x++;
			if(x++ > y--)
			{
				break;
			}
		}while(x++<=5);
		System.out.println(x+"\t"+y);
	}
}