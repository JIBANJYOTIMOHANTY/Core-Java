class X
{
	int i;
	X()
	{
		i++;
		System.out.println("X class");
	}
}
class Y extends X
{
	int j; 
	Y()
	{
		i++;
		j++;
		System.out.println("Y class");	
	}
}
public class Single
{
	public static void main(String args[])
	{
		Y aa = new Y();	
		System.out.println(aa.i+"\t"+aa.j);
	}
}