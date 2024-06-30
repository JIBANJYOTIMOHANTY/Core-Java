import java.util.*;
public class Asc_Dist
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total number of districts : ");
        int n = sc.nextInt();
        System.out.println("Enter the districts : ");
        sc.nextLine();
        String dist[] = new String[n];
        for(int i = 0; i < n; i++)
        {
            dist[i] = sc.nextLine();
        }
        for(int i = 0; i < n - 1 ; i++)
        {
            for(int j = i+1; j < n ; j++)
            {
                if(dist[i].compareTo(dist[j]) > 0)
                {
                    String temp = dist[i];
                    dist[i] = dist[j];
                    dist[j] = temp;
                }
            }
        }
        
        for(int i = 0; i < n; i++)
        {
            System.out.print(dist[i] + "\t");
        }
    }
}