public class Incre_Decre_Prece
{
	public static void main(String args[])	
	{
		int x = 10;
		int y = x++ + ++x - x-- * x++ / --x;
//Here calculation starts from left to right and * is calculated first because * has higher precedence as compared to all other operators.
		System.out.println(x+"\t"+y);
	}
}