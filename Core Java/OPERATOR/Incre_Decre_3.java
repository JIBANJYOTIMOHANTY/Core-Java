public class Incre_Decre_3
{
	public static void main(String args[])
	{
		int x = 10;
		int y = x++ + x++ + x++ + x-- + ++x + x++ + x++;//Here Calculation starts from left to right
		System.out.println(x+"\t"+y);
	}
}