import java.util.Scanner;
public class Input
{
    public native boolean check(int num);
    public static void main(String args[])
    {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        Input ii = new Input();
        boolean bb = ii.check(num);
        if(bb == true)
        {
            System.out.println(num + " is an armstrong number.");
        }
        else
        {
            System.out.println(num + " is not an armstrong number.");
        }
    }
    static 
    {
        System.loadLibrary("Armstrong");
    }
}