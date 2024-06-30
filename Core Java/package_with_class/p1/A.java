package p1;
public class A
{
	public void m1()
	{
		System.out.println("I am a Public method.");
	}
	
	protected void m2()
	{
		System.out.println("I am a Protected method.");
	}

	void m3()
	{
		System.out.println("I am a default / no access method.");
	}

	private void m4()
	{
		System.out.println("I am a private method.");
	}
	
	public void call1()
	{
		m1();
		m2();
		m3();
		m4();
	}
}