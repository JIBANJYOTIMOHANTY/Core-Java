public class Reverse_Mirror {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int m = n;
        int sum = 0;
        while(n > 0)
        {
            int rem = n % 10;
            sum = sum * 10 + rem;
            n /= 10;
        }
        System.out.println("Reverse is : "+sum);
    }
}
