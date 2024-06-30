public class IndexOf
{
	public static void main(String args[])
	{
		String s = "This is a demo of java program";

		int index = s.indexOf("a");
		System.out.println("Index : " + index);

		int index2 = s.indexOf('a' , (index + 1));
		System.out.println("Index : " + index2);

		int index3 = s.indexOf('a' , (index2 + 1));
		System.out.println("Index : " + index3);

		int index4 = s.indexOf('a' , (index3 + 1));
		System.out.println("Index : " + index4);
	}
}