import java.util.*;
public class vector
{
	public static void main(String args[])
	{
		Vector vv = new Vector();
		System.out.println("Size of the vector before insertion is : " +vv.size());
		System.out.println("Capacity of the vector is : " + vv.capacity());
		vv.add("Java");
		vv.add("Python");
		vv.add("Django");
		vv.add("SpringBoot");
		vv.add("Ruby");
		// vv.add("Swift");	
		System.out.println("Size of the vector after insertion is : " + vv.size());
		System.out.println("Capacity of the vector is : " + vv.capacity());
		ArrayList aa = new ArrayList();
		aa.add("Oracle"); 
		aa.add("MySQL");
		aa.add("SQL");
		aa.add("MongoDB");
		aa.add("DB2");
		aa.add("Postgress");
		vv.addAll(aa);
		System.out.println("Size of the vector after insertion is : " + vv.size());
		System.out.println("Capacity of the vector is : " + vv.capacity());
		for(int i = 0; i < vv.size(); i++)
		{
			String name =(String) vv.get(i);
			System.out.print(name + "\t");
		}
	}
}