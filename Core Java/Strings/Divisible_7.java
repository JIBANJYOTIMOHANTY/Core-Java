public class Divisible_7
{
    static boolean check(int num)
    {
        if(num < 0)
        {
            return check(-num);
        }
        if(num == 0 || num == 7)
        {
            return true;
        }
        if(num < 10)
        {
            return false;
        }
        return check(num / 10 - 2 * (num - num/ 10 * 10));
    }
    public static void main(String[] args) 
    {
        int a = 371;
        if(check(a))
        {
            System.out.println("Divisible");
        }
        else
        {
            System.out.println("Not divisible");
        }
            
    }
}