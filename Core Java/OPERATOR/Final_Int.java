public class Final_Int
{
	public static void main(String args[])
	{
		final int a = 128;
		byte b = (byte)a;//Type casting is required because It cross the range
		final int i = 53;
		short c = i;
		byte d = i;
		char e = i;
		System.out.println(b);
		System.out.println(c);
		System.out.println(e);
		System.out.println(d);
	}
}