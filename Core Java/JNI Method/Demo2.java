import java.util.Scanner;

public class Demo2
{
    public native int reverse(int a);
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in)    ;
        System.out.println("Enter a number : ");
        int a = sc.nextInt();
        Demo2 dd = new Demo2();
        int sum = dd.reverse(a);
        System.out.println("Reverse is : " + sum);
    }
    static
    {
        System.loadLibrary("Reverse");
    }
}