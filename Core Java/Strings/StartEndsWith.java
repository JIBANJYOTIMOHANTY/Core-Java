public class StartEndsWith
{
	public static void main(String args[])
	{
		String s = "This is a demo of java program";
		int start = s.indexOf('j');
		int end = s.length();
		char ch[] = new char[end - start];
		s.getChars(start,end,ch,0);
		System.out.println(ch);
		
		if((s.startsWith("This")) && (s.endsWith("program")))
		{
			System.out.println("I Like Java");
		}
		else
		{
			System.out.println("I Hate Java");
		}
	}
}