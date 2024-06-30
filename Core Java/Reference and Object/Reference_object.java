public class Reference_object
{
	int data;
	public static void main(String args[])
	{
		Reference_object r;
		r = new Reference_object();
		System.out.println("Data = " + r.data);
		r.data += 5;
		System.out.println("Data after initialisation = " + r.data);
		Reference_object r1;
		r1 = new Reference_object();
		System.out.println("Data = " + r1.data);
		r1.data += 10;
		System.out.println("Data after initialisation = " + r1.data);
	}
}