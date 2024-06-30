public class byte_class
{
	public static void main(String args[])
	{
		Byte b1 = new Byte((byte)1);
		System.out.println(b1);

		Byte b2 = new Byte("12");
		System.out.println(b2);

		Byte data = Byte.parseByte("19");
		System.out.println(data);

		String s = Byte.toString((byte)11);
		System.out.print(s + "\t");
		s += 1;// s = s + 1
		System.out.print(s);

		String s1 = Byte.toString((byte)11);
		System.out.println("\n"+s1);
	}
}