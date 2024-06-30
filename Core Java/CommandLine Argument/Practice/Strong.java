/**
 * InnerStrong
 */
public class Strong {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int x = n;
        int sum = 0;
        while(x > 0)
        {
            int rem = x % 10;
            int f = 1;
            while(rem > 0)
            {
                f = rem * f;
                rem--;
            }
            sum += f;
            x /= 10;
        }
        if(n == sum)
        {
            System.out.println("The number is Strong.");
        }
        else
        {
            System.out.println("The number is not Strong.");
        }
    }
    
}