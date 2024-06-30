public class Palindrome
{
	public static void main(String args[])
	{
		int n = Integer.parseInt(args[0]);
		int m = n;
		int sum = 0;
		while(n > 0)
		{	
			int rem = n % 10;
			sum = sum * 10 + rem;
			n /= 10;
		}
		if(m == sum)
		{
			System.out.println("The number is palindrome.");
		}
		else
		{
			System.out.println("The number is not palindrome.");
		}
	}
}