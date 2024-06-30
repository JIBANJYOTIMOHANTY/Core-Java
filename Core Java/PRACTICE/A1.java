import java.util.Scanner;

public class A1
{
    int data ;
    String name ;
    String pwd ;
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        A1 aa = new A1();
        aa.data = sc.nextInt();
        aa.name = sc.nextLine();
        aa.pwd = sc.nextLine();
        new A2().h(aa);
    }
    
}