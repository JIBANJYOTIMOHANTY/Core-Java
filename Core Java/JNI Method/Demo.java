import java.util.Scanner;
public class Demo 
{
    public native static int fact(int num);
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int a = sc.nextInt();
        Demo dd = new Demo();
        int f = fact(a);
        System.out.println("Factorial of the " + a + " is : " + f);
    }    
    static 
    {
        System.loadLibrary("Factorial");;
    }
}