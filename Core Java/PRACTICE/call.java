import java.util.Scanner;

public class call 
{
    public static void prime(int num)
    {
        int count = 0;
        for(int i = 1; i <= num; i++)
        {
            if(num % i == 0)
            {
                count++;
            }
        }
        if(count == 2)
        {
            System.out.println(num + " is a prime number.");
        }
        else
        {
            System.out.println(num + " is not a prime number.");
        }
    }
    public static void perfect(int num)
    {
        int sum = 0;
        for(int i = 1; i < num; i++)
        {
            if(num % i == 0)
            {
                sum += i;
            }
        }
        if(sum == num)
        {
            System.out.println(num + " is a perfect number.");
        }
        else
        {
            System.out.println(num + " is not a prime number.");
        }
    }
    public static void strong(int num)
    {
        int j = num, temp = 0, total = 1, gt = 0;
        while(num > 0)
        {
            total = 1; 
            temp = num % 10;
            for(int i = 1; i <= temp; i++)
            {
                total = total * i;
            }
            gt = gt * total;
            num = num / 10;
        }
        if(gt == j)
        {
            System.out.println(j + " is a strong number.");
        }
        else
        {
            System.out.println(j + " is not a strong number.");
        }
    }
    public static void amstrong(int num)
    {
        int temp = 0 , sum = 0, i = num;
        while(i > 0)
        {
            temp = i % 10;
            sum += (temp * temp * temp);
            i /= 10;
        }
        if(num == sum)
        {
            System.out.println(num + " is a amstrong number.");
        }
        else
        {
            System.out.println(num + " is not a amstrong number.");
        }
    }
    public static void main(String[] args) 
    {
        Scanner ss = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = ss.nextInt();
        while(true)
        {
            System.out.println("\t\t\t***********Check The Option***********");
            System.out.println("\t\t\t1>Check Prime Number.");
            System.out.println("\t\t\t2>Check Amstrong Number.");
            System.out.println("\t\t\t3>Check Perfect Number.");
            System.out.println("\t\t\t4>Check Strong Number.");
            System.out.println("\t\t\t5>Quit.");
            System.out.println("Enter your choice : ");
            int ch = ss.nextInt();
            switch(ch)
            {
                case 1:
                    prime(num);
                    break;
                case 2:
                    amstrong(num);
                    break;
                case 3:
                    perfect(num);
                    break;
                case 4:
                    strong(num);
                    break;
                case 5:
                    System.out.println("Thank you for using my application.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("!!!!!!!Invalid Option!!!!!!!");
                    break;
            }
        }
    }
}
