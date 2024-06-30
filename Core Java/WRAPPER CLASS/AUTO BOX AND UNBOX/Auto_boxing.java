public class Auto_boxing
{
	public static void main(String args[])
	{
		Boolean b = new Boolean("Java");
		System.out.println(b);

		boolean data = true;
		System.out.println(data);
		b = data;
		System.out.println(b);
	}
}