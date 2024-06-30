public class Short_class
{
	public static void main(String args[])
	{
		Short s = new Short((short)10);
		System.out.println(s);

		Short s2 = Short.parseShort("20");
		System.out.println(s2);

		String s3 = Short.toString((short)30);
		System.out.println(s3);
		
	}
}