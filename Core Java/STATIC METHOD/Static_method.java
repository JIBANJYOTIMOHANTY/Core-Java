public class Static_method
{
	static int data = get();
//Here class loader loads static variables in class loading time.
//Here I call get() to initialise data.
//So here class loader execute get() method at class loading time.
//So here get() method is first executed before main() method is executed.
	static int get()
	{
		System.out.println("Hello CMD");
		return 1;
	}
	public static void main(String args[])
	{
		System.out.println("I am main method");
		System.out.println(data);
	}
}