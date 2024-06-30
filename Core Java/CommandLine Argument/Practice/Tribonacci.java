/**
 * Tribonacci
 */
public class Tribonacci {

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int ft = 0;
        int st = 1;
        int tt = 1;
        int nt = 0;
        int i = 0;
        if(n == 1)
        {
            System.out.print(ft + "\t");
        }
        else if(n == 2)
        {
            System.out.print(ft + "\t" + st + "\t");
        }
        else if(n == 3)
        {
            System.out.print(ft + "\t" + st + "\t" + tt + "\t");
        }
        else
        {
            System.out.print(ft + "\t" + st + "\t" + tt + "\t");
            for(i = 1; i < n - 2; i++ )
            {
                nt = ft + st + nt;
                System.out.print(nt + "\t");
                ft = st;
                st = tt;
                tt = nt;
                
            }
        }
    }
}