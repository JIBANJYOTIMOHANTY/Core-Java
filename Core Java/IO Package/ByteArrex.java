import java.io.*;
class ByteArrex
{
	public static void main(String args[])
	{
		byte b[] = {10,20,30,40,50};
		ByteArrayInputStream b1 = new ByteArrayInputStream(b);
		int k;
		while((k = b1.read()) != -1)
		{
			char ch = (char)k;
			System.out.println("Ascii : " + k + " value : " + ch);
		}
	}
}