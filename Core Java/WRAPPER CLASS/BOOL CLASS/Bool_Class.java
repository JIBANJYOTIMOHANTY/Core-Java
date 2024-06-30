public class Bool_Class
{
	public static void main(String args[])
	{
		Boolean b1 = new Boolean("Java");
		System.out.println(b1);
		
		Boolean b2 = new Boolean("False");
		System.out.println(b2);

		System.out.println(new Boolean("True"));

		Boolean b3 = new Boolean("TrUE");
		System.out.println(b3);

		Boolean b4 = new Boolean("TrUeEEEEEE");
		System.out.println(b4);

		boolean b5 = Boolean.parseBoolean("XyZ");	
		System.out.println(b5);

		
		boolean b6 = Boolean.parseBoolean("True");	
		System.out.println(b6);

		boolean b7 = Boolean.parseBoolean("False");	
		System.out.println(b7);

		String b8 = Boolean.toString(true);
		b8 += " Value "; // b6 = b6 + " Value "
		System.out.println(b8);
		
		String b9 = Boolean.toString(false);
		b9 += " Value ";
		System.out.println(b9);
			
	}
}