/**
 * Recur_Palindrome
 */
public class Recur_Palindrome {
    public static int call(int a, int b)
    {
        if(a == 0)
        {
            return b;
        }
        int rem = a % 10;
        b = b * 10 + rem;
        return call(a/10,b);
    }
    public static void main(String[] args) {
        int c = 121;
        int d = call(c,0);
        if(c == d)
        {
            System.out.println("The number is palindrome.");
        }
        else
        {
            System.out.println("The number is not palindrome.");
        }
    }
}