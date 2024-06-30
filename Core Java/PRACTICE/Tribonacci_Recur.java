public class Tribonacci_Recur {
    public static int Trib(int a)
    {
        if(a == 0 || a == 1 || a == 2)
        {
            return 0;
        }
        else if(a == 3)
        {
            return 1;
        }
        else
        return (Trib(a - 1) + Trib(a-2) + Trib(a-3));
    }
    public static void main(String[] args) {
        int n = 3;
        System.out.println(Trib(n));
        for(int i = 1; i <=  n; i++)
        {
            System.out.print(Trib(i)+ "\t");
        }
    }
}
