public class IncrementCommand
{
	public static void main(String args[])
	{
		int x = 0;
		int size = args.length;
		while(x++ < size)
		{
			System.out.println(args[x]);	
		}
	}
}