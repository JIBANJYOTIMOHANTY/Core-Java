//Pojo means Plain object java object
class Stud
{
	private String name;
	private int Roll;
	
	Stud()
	{
		System.out.println("Object is constructed.");
	}
	
	public void setName(String s)
	{
		name = s;
	}
	public String getName()
	{
		return name;
	}

	public void setRoll(int r)
	{
		Roll = r;
	}
	public int getRoll()
	{
		return Roll;
	}
}
public class Pojo
{
	public static void main(String args[])
	{
		Stud s = new Stud();
		s.setName("Jiban");
		s.setRoll(2101294079);
		
		System.out.println("Name is : "+s.getName()+"\n"+"Roll is : "+s.getRoll());
	}
}