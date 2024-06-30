public class Print_this
{
	int data;
	Print_this()
	{
		System.out.println("Object is constructed.");
	}
	Print_this(int data)
	{
		this.data = data;
		System.out.println(this);
	}
	
	@Override
	public String toString()
	{
		return "Java";
	}
	public void setData(int data)
	{
		this.data = data;
		System.out.println(data);
	}
	public int getData()
	{
		return data;
	}
	public static void main(String args[])
	{
		Print_this t1 = new Print_this();
		t1.setData(15);
		System.out.println(t1);
		System.out.println("Data value is : " + t1.data);

		Print_this t2 = new Print_this(23);
		System.out.println("Data value is : " + t2.getData());
		System.out.println(t2);
	}
}