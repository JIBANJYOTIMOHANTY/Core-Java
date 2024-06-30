public class HashCode
{
	public static void main(String args[])
	{
		String s1 = "Java";
		String s2 = "java";
		String s3 = "java";
		String s4 = "Java";

		System.out.println("s1 hashcode : " + s1.hashCode());
		System.out.println("s2 hashcode : " + s2.hashCode());
		System.out.println("s3 hashcode : " + s3.hashCode());
		System.out.println("s4 hashcode : " + s4.hashCode());
	}
}