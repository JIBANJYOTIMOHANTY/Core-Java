import java.util.*;
@FunctionalInterface
interface X
{
    public void cube();   
}
public class Lambda
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        X ab = ()->{System.out.println("Cube of "+ num + " is : " + (num*num*num));};
        ab.cube();
    }
}