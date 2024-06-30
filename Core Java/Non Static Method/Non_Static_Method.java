public class Non_Static_Method
{
	private int data;
	public Non_Static_Method()
	{
		System.out.println("Object is Constructed.");
	}
	void increment()
	{
		data++;
	}
	public static void main(String args[])
	{
		Non_Static_Method aa = new Non_Static_Method();
		System.out.println("Data Value is : "+aa.data);
		aa.increment();
		aa.increment();
		aa.increment();
		aa.increment();
		aa.increment();
		System.out.println("Data Value is : "+aa.data);

		Non_Static_Method bb = new Non_Static_Method();
		aa.increment();
		aa.increment();
		aa.increment();
		aa.increment();
		aa.increment();
		System.out.println("Data Value is : "+aa.data);
		System.out.println("Data Value is : "+bb.data);		
	}
}