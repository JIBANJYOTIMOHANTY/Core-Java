import java.util.Scanner;

public class Demo1
{
    public native int get(int num);
    public static void main(String agrg[])
    {
        System.loadLibrary("Sum");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int a = sc.nextInt();
        Demo1 dd = new Demo1();
        int sum = dd.get(a);
        System.out.println("Sum of the series : " + sum);
    }
    
}