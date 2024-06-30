public class Print_Reference_2
{
	int data ;
	public static void main(String args[])
	{
		Print_Reference_2 aa;
		aa = new Print_Reference_2();
		System.out.println(aa);

	}
	@Override
	public String toString()
	{
		return String.valueOf(data);
	}
}