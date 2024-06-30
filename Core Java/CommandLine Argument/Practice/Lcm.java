public class Lcm {
    public static void main(String[] args) {
        int n1 = Integer.parseInt(args[0]);
        int n2 = Integer.parseInt(args[1]);
        int a = n1;
        int b = n2;

        while(n1 != n2)
        {
            if(n1 > n2)
            {
                n1 -= n2;
            }
            else
            {
                n2 -= n1;
            }
        }

        int lcm = (a * b) / n2;
        System.out.print("LCM is : "+lcm);
    }
}
