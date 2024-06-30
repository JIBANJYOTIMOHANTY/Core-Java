import java.io.*;
class byteRead
{
	public static void main(String args[])
	{
		try
		{
			FileInputStream in = new FileInputStream("File1.txt");
			int c;
			while((c = in.read()) != -1)
			{
				System.out.print((char)c);
			}
			in.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}