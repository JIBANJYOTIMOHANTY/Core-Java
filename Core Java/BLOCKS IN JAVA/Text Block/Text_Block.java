public class Text_Block
{
	public static void main(String args[])
	{
		String s = "Jiban";
		int roll = 101;
		double sal = 23000.99;
		char data = 'A';

		String message = """
		I like : %s \nMy roll number is : %d \nMy Salary is : %f \nMy Grade is %c\n""";
		
		String message1 = message.formatted(s,roll,sal,data);
		System.out.println("Message is : " + message);
		System.out.print("Message is : " + message1);
	}
}