public class substring
{
	public static void main(String args[])
	{
		int data = 16;
		String s = String.valueOf(data);
		s += 1;
		System.out.println(s);

		String ss = new String("I am Jiban jyoti mohanty");
		String sub = ss.substring(5,ss.length());
		System.out.println(sub);
	}
}