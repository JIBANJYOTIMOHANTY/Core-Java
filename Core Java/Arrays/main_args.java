public class main_args
{
	public static void main(String args[])
	{
		Call(args);
	}
	static void Call(String arr[])
	{
		int size = arr.length;
		System.out.println(".......See the command line arguments.......");
		for(int i = 0; i < size; i++)
		{
			System.out.println(arr[i]);
		}
	}
}