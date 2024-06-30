/**
 * Fibonacci
 */
public class Fibonacci {

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int ft = 0;
        int nt = 0;
        int st = 1;
        System.out.print(ft + "\t" + st +"\t");
        for(int i = 1; i <= n-2; i++ )
        {
            nt = ft + st;
            System.out.print(nt+"\t");
            ft = st;
            st = nt;
        }
    }
}