public class Modulo
{
	public static void main(String args[])
	{
		short s1 = 10;
		short s2 = 20;
		//short s3 = s1 % s2;//Error (s1%s2) result treated as int , that means int can't be converted to short.
		short s3 = (short) (s1 % s2);
		System.out.println(s3);
		s1 *= s2;
		System.out.println(s1);
	}
}