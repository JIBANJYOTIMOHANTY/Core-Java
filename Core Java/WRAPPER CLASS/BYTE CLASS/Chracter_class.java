public class Character_class
{
	public static void main(String args[])
	{
		Character c = new Character('a');
		System.out.println(c);

		boolean c1 = Character.isLetter('A');
		System.out.println(c1);

		boolean c2 = Character.isDigit('0');
		System.out.println(c2);	

		boolean c3 = Character.isWhitespace(' ');
		System.out.println(c3);

		boolean c4 = Character.isWhitespace('\t');
		System.out.println(c4);

		boolean c5 = Character.isUpperCase('A');
		System.out.println(c5);

		boolean c6 = Character.isUpperCase(65);
		System.out.println(c6);

		boolean c7 = Character.isLowerCase('a');
		System.out.println(c7);

		boolean c8 = Character.isLowerCase(52);
		System.out.println(c8);
		
		char s1 = Character.toUpperCase('a');
		System.out.println(s1);

		int s2 = Character.toUpperCase(97);
		System.out.println(s2);

		int s3 = Character.toUpperCase(48);
		System.out.println(s3);
		
		char s4 = Character.toLowerCase('A');
		System.out.println(s4);

		int s5 = Character.toLowerCase(65);
		System.out.println(s5);

		int s6 = Character.toLowerCase(48);
		System.out.println(s6);

		String s7 = Character.toString('A');
		System.out.println(s7);

		String s8 = Character.toString('5');
		System.out.println(s8);


		
	}
}