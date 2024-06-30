public class Incre_Decre_2
{
	public static void main(String args[])
	{
		int x = 10;
		int y = x++;
		System.out.println(x+"\t"+y);
		
		x = x++;//Here x = 11 because we are assining x to x++ and x++ is post increment.
		System.out.println(x);

		x = ++x;//Here x = 12 because we are assining x to ++x and ++x is pre increment.
		System.out.println(x);

		x = x--;
		System.out.println(x);
	}
}