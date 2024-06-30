public class This
{
	String name;
	int roll;
	This()
	{
		System.out.println("Object is constructed.");
	}
	This(String name)
	{
		this();
		//It call the same class non parameterized constructor.
		//here this point to same object.
		//At the calling of the constructor this keyword must be declared in the first line.
		this.name = name;
		//here this keyword is used to differentiate instance variable and parameter.
		//Here there is no restriction of placing this keyword.
	}
	This(int roll)
	{
		this("Jiban");
		//It call same class parameterized constructor of string type.
		//here this point to same object.
		//At the calling of the constructor this keyword must be declared in the first line.
		this.roll = roll;
	}
	public static void main(String args[])
	{
		This aa = new This(12);
		System.out.println(aa);
		
		This tt = new This("Jyoti");
		System.out.println(tt);
	}
	@Override
	public String toString()
	{
		return "Name is : " + name + "\nRoll is : " + roll;
	}
}