public class Unboxing
{
	public static void main(String args[])
	{
		Byte i = new Byte((byte)129);
		int x = i;

		x++;
		System.out.println(x);
	}
}