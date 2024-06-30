class Outer
{
	static int roll;
	static String name;
	static class X
	{
		void setRoll(int a)
		{
			roll = a;
		}
	}
	
	static class Y extends X
	{
		void setName(String s)
		{
			name = s;
		}
	}
}
public class demo2
{
	public static void main(String args[])
	{
		Outer.Y aa = new Outer.Y();
		aa.setName("Jiban Jyoti");
		aa.setRoll(1);
		System.out.println("Name is : " + Outer.name + "\nRoll is : " + Outer.roll);
	}
}