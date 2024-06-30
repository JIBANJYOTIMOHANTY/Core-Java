public class Call_by_Reference
{
	int data;
	public static void main(String args[])
	{
		Call_by_Reference Call;
		Call = new Call_by_Reference();
		System.out.println(Call.data);
		Call.data += 5;
		System.out.println(Call.data);
		Call(Call);
		System.out.println(Call.data);
	}
	static void Call(Call_by_Reference x)
	{
		x.data++;
	}
}