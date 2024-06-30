public class Recursion_table {
    static void mul_table(int a, int b)
    {
        if(b > 10)
        {
            return;
        }
        else
        {
            System.out.println(a + " x " + b + " = " + a*b);
            mul_table(a, b+1);
        }
    }
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        mul_table(n,1);
    }
}
