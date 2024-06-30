public class fibonacci {
    public static int fib(int n)
    {
        if(n == 0 || n == 1)
        {
            return n;
        }
        return (fib(n-1)+fib(n-2));
    }
    public static void main(String[] args) {
        // System.out.println(fib(8));
        for(int i = 0; i <= 8; i++)
        {
            System.out.print(fib(i)+"\t");
        }
    }
}
