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
class Z extends Y
{
	int k;
	Z()
	{
		i++;
		j++;
		k++;
		System.out.println("Z class");
	}
}
public class Multi
{
	public static void main(String args[])
	{
		Z aa = new Z();
		System.out.println(aa.i+"\t"+aa.j+"\t"+aa.k);
	}
}