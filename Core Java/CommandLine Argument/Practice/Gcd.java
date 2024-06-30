import java.util.Scanner;

public class Gcd
{
    public static void main(String[] args) 
    {
        int n1 = Integer.parseInt(args[0]);
        int n2 = Integer.parseInt(args[1]);
        Scanner sc = new Scanner(System.in);
        while(n1 != n2)
        {
            if(n1>n2)
            {
                n1 -= n2;
            }
            else
            {
                n2 -= n1;
            }
        }
        System.out.println("GCD is : " + n2);
    }
}