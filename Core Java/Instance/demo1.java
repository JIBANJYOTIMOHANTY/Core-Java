public class demo1
{
	public static void main(String args[])
	{
		demo1 dd = new demo1();
		System.out.println(dd instanceof demo1);
		System.out.println(dd instanceof Object);

		String s1 = new String("Jiban");
		System.out.println(s1 instanceof String);
		System.out.println(s1 instanceof Object);
	}
}