public class Text10
{
	public static void main(String args[])
	{
		int x = 66;
		switch(x)
		{
			case 'A'+5:
				System.out.println("Hi");
				break;
			case 'B':
				System.out.println("Hello");
				break;
			case 'C':
				System.out.println("Java");	
				break;
		/******************* If I don't comment case 70 then it will show an error which is duplicate case label.*******************/
			//case 70:
				//System.out.println("I love Java");
				//break;
			default:
				System.out.println("Bye ");
				break;
		}
	}
}