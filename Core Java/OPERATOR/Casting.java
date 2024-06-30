public class Casting 
{
	public static void main(String args[])
	{
		//Auto Conversion / Widdening Conversion / Implicit Conversion
		byte b1 = 17;
		short s1 = b1;
		int i1 = s1;
		float f1 = i1;
		double d1 = f1;
		System.out.println(b1+"\t"+s1+"\t"+i1+"\t"+f1+"\t"+d1);

		//Type Casting / Narrow Conversion / Explicit Conversion
		double d = 12.99;
		float f = (float)d;
		long l = (long)d;
		int i = (int)d;
		short s = (short)d;
		byte b = (byte)d;
		System.out.println(d+"\t"+f+"\t"+l+"\t"+i+"\t"+s+"\t"+b);
	}
}