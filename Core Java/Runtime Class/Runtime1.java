// import java.io.*;
public class Runtime1
{
	public static void main(String args[]) 
	{
		Runtime r1 = Runtime.getRuntime();
		Runtime r2 = Runtime.getRuntime();
		if(r1 == r2)
		{
			System.out.println("It is a singleton class.");
		}
		else
		{
			System.out.println("It is not a singleton class.");
		}
		System.out.println("Free Memory is : " + r1.freeMemory());
		System.out.println("Total Memory is : " + r1.totalMemory());
		r1.exit(0);
		System.out.println("Hello");
	}
}