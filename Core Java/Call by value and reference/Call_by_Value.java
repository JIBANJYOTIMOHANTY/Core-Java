public class Call_by_Value
{
	int data;
	public static void main(String args[])
	{
		Call_by_Value C;
		C = new Call_by_Value();
		System.out.println(C.data);
		Call(C.data);
		System.out.println(C.data);	
	}
	static void Call(int x)
	{
		x++;
	}
}