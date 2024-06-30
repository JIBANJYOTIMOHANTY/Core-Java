class X
{
	int i;
}
class Y extends X
{
	int j;
}
public class Type_casting_object_reference_2
{
	public static void main(String args[])
	{
		Y a1 = new Y();
		a1.i++;
		a1.j++;
		System.out.println(a1.i+"\t"+a1.j);
		X a2 = a1;
		a2.i++;
		System.out.println(a2.i);	
		Y a3 = (Y) a2;
		a3.i++;	
		a3.j++;
		System.out.println(a3.i+"\t"+a3.j);
	}
}