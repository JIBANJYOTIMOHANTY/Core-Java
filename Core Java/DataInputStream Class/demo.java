import java.io.DataInputStream;
import java.io.IOException;
public class demo
{
	@Deprecated
	public static void main(String []args) throws IOException
	{
		DataInputStream d = new DataInputStream(System.in);
		System.out.println("Enter your name : ");
		String name = d.readLine();
		System.out.println("Name : "+name);
		
	}
}