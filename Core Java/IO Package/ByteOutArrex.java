import java.io.*;
class ByteOutArrex
{
	public static void main(String args[])
	{
		try
		{
		FileOutputStream f1 = new FileOutputStream("Ex1.txt");
		FileOutputStream f2 = new FileOutputStream("Ex2.txt");
		ByteArrayOutputStream b = new ByteArrayOutputStream();
		b.write(57);
		b.writeTo(f1);
		b.writeTo(f2);
		b.flush();
		b.close();
		System.out.println("Success.....");
		}
		catch(Exception e)
		{System.out.println(e);}
	}
}