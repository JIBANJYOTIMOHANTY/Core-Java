import java.util.*;
public class Split
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your name : ");
		String name = sc.nextLine();
		String ss[] = name.split(" ");
		String s = "";
		for(int i = 0; i < ss.length ; i++)
		{
			if(i == ss.length - 1)
			{
				s += ss[ss.length - 1];
			}
			else
			{
				s += ss[i].charAt(0);
				s += " ";
			}
		}
		System.out.println(s );
	}
}