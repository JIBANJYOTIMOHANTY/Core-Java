public class Print_Reference
{
	int data;
	public static void main(String args[])
	{
		Print_Reference aa;
		aa = new Print_Reference();
		System.out.println(aa);
/*** when i print the value of reference of Print_Reference class then it must implicitly call toString() method of object class. ***/
	//It must return "<classname>@address" in String form.
	}
}