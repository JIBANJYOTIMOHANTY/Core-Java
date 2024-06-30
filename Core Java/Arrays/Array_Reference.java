public class Array_Reference
{
	public static void main(String args[])
	{
		int arr[];
		arr = new int[1];
		System.out.println(arr[0]);
		arr[0] += 1;
		System.out.println(arr[0]);
		Call(arr);
		System.out.println(arr[0]);		
	}
	static void Call(int x[])
	{
		x[0] += 5;
	}
}