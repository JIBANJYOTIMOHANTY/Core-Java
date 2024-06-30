public class Type_casting_object_reference_3
{
	int data;
	public static void main(String args[])
	{
		Type_casting_object_reference_3 t1 = new Type_casting_object_reference_3();	
		
		t1.data += 5;
		Type_casting_object_reference_3 t2 = new Type_casting_object_reference_3();
		t2.data++;
		t1 = t2;
		t1.data++;
		t2.data++;
		System.out.println(t1.data+"\t"+t2.data);
	}
}