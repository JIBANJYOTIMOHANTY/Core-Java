import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.DataInputStream;
public class WriteData
{
	public static void main(String args[])
	{
		try
		{
			DataInputStream dis = new DataInputStream(System.in);
			System.out.println("Enter the line : ");
			String data = dis.readLine();
			FileOutputStream fos = new FileOutputStream("D:/JAVA/JAVA WITH JT/IO Package/a1.txt",true);
			byte x[] = new byte[data.length() + 1];
			//byte x[] = data.getBytes();
			x = data.getBytes();
			//x = new byte[x.length + 1];
			x[x.length - 1] = '\n';
			fos.write(x);
			
			fos.close();
		}
		catch(FileNotFoundException fe)
		{
			fe.printStackTrace();
		}
		catch(IOException ie)
		{
			ie.printStackTrace();
		}
	}
}