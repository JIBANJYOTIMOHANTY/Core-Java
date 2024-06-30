public class demo2
{
	public static void main(String args[])
	{
		demo1 dd = demo1.createObject();// dd = new demo1();
		dd.setName("Java");
		dd.setRoll(1);
		System.out.println("Name is : " + dd.getName() + "\n" + "Roll is : " + dd.getRoll());
	}
}