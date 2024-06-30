import java.io.*;
public class Demo1
{
	public static void main(String args[]) throws Exception
	{
		String str[] = {"notepad","Demo2.java"};
		Runtime rr = Runtime.getRuntime();
		Process pp = rr.exec(str);
		System.out.println(pp);
	}
}