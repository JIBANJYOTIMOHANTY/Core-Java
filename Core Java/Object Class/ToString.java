public class ToString
{
	String name;
	int roll;
	double fee;
	String address;
	ToString(String name, int roll, double fee, String address)
	{
		this.name = name;
		this.roll = roll;
		this.fee  = fee;
		this.address = address;
	}
	@Override
	public String toString()
	{
		return "Name : " + name + "\nRoll : " + roll + "\nFee : " + fee + "\nAddress : " + address;
	}
	public static void main(String args[])
	{
		ToString t1 = new ToString("Jiban",100,10000,"Cuttack");
		t1.toString();
		System.out.println(t1.toString());
		System.out.println(t1);
	}
}