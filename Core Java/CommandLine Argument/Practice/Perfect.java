public class Perfect {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int sum = 0;
        for(int i = 1; i < n; i++)
        {
            if(n%i == 0)
            {
                sum += i;
            }
        }
        if(sum == n)
        {
            System.out.println("The number is perfect.");
        }
        else
        {
            System.out.println("The number is not perfect.");
        }
    }
}
