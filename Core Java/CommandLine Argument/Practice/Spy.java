public class Spy 
{
    public static void main(String[] args) 
    {
        int n = Integer.parseInt(args[0]);
        int sum = 0;
        int product = 1;
        while(n > 0)
        {
            int rem = n % 10;
            sum += rem;
            product *= rem;
            n /= 10;
        }
        if(sum == product)
        {
            System.out.println("The number is spy number.");
        }
        else
        {
            System.out.println("The number is not spy number.");
        }
    }
}
