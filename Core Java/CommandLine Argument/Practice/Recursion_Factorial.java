public class Recursion_Factorial 
{
    static int fact(int n)
    {
        if(n == 0)
        {
            return 1;
        }
        else
        {

            return n * fact(n-1);
        }
    }
    public static void main(String[] args) 
    {
        int n = Integer.parseInt(args[0]);
        System.out.println(fact(n));
    }
}
