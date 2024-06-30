public class Reference_object_swap
{
	int data;
	static void swap(Reference_object_swap a, Reference_object_swap b)
	{
		int temp = a.data;
		a.data = b.data;
		b.data = temp;
	}
	public static void main(String args[])
	{
		Reference_object_swap r;
		r = new Reference_object_swap();
		r.data += 5;
		
		Reference_object_swap r1;
		r1 = new Reference_object_swap();
		r1.data += 10;

		System.out.println("Before Swap");
		System.out.println("r.data = " +r.data+" r1.data = "+r1.data);

		swap(r,r1);
		System.out.println("After Swap");
		System.out.println("r.data = " +r.data+" r1.data = "+r1.data);
	}
}