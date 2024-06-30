import java.io.*;
class byteWrite
{
	public static void main(String args[])
	{
		byte b[] = {'J','i','b','a','n'};
		try
		{
			FileOutputStream f = new FileOutputStream("File1.txt");
			f.write(b);
			f.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}