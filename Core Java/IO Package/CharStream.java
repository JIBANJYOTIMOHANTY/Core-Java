import java.io.*;
public class CharStream
{
	public static void main(String args[])
	{
		File in = new File("File1.txt");
		File out = new File("FileWrite.txt");
		
		try
		{
			FileReader frd = new FileReader(in);
			FileWriter fwr = new FileWriter(out);
			int ch;
			while((ch = frd.read()) != -1)
			{
				fwr.write(ch);
			}
			frd.close();
			fwr.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}