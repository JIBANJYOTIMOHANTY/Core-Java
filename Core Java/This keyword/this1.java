public class this1
{
	int data ;
	this1()
	{
		System.out.println("Object is constructed.");
	}
	this1(int data)
	{
		this.data = data;
	}

	public void setData(int data)
	{
		this.data = data;
	}
	public int getData()
	{
		return data;
	}
	
	public static void main(String args[])
	{
		this1 t = new this1();
		t.setData(15);
		System.out.println("Data value is : " + t.getData());
		
		this1 t2 = new this1(23);
		System.out.println("Data value is : " + t2.getData());
	}
}