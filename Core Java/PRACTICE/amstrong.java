public class amstrong {
    public static int call(int a, int b, int c)
    {
        if(a == 0)
        {
            return b;
        }
        int rem = a % 10;
        b += Math.pow(rem,c);
        return call(a/10,b,c);
    }
    public static void main(String[] args) {
        int n = 13;
        int count = 0;
        int b = n;
        while(b != 0)
        {
            count++;
            b /= 10;
        }
        int m = call(n,0,count);
        if(n == m)
        {
            System.out.println("The number is amstrong.");
        }
        else
        {
            System.out.println("The number is not amstrong.");
        }
    }
}
