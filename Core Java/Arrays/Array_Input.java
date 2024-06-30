import java.util.*;
public class Array_Input
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array : " );
		int n = sc.nextInt();

		int arr[];
		arr = new int[n];
		
		System.out.println("Enter the array elements : ");
		for(int i = 0; i < n; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Before sorting Array elements are : ");
		for(int i : arr)
		{
			System.out.print(i + "\t");
		}
		
		Arrays.sort(arr);
		System.out.println("\nAfter sorting Array elements are : ");
		for(int i : arr)
		{
			System.out.print(i + "\t");
		}
	}
}