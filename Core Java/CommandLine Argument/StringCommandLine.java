public class StringCommandLine
{
	public static void main(String args[])
	{
		call(args);
	}
	
	static void call(String arr[])
	{
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i]+ " ");
		}
	}
}