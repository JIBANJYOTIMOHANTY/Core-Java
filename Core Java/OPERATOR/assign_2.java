public class assign_2
{
	public static void main(String args[])
	{
		int a, b, c, d;
		a = b = c = d = 10;
		a += b -= c *= d /= 5;//Calculation starts from right to left <----------
		System.out.println(a+"\t"+b+"\t"+c+"\t"+d);
	}
}