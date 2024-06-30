import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Throw_Demo1 
{
    public static void main(String[] args) 
    {
        try    
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter first number : ");
            int num1 = Integer.parseInt(br.readLine());
            System.out.println("Enter second number : ");
            int num2 = Integer.parseInt(br.readLine());
            System.out.println("Sum is : "+(num1 + num2));
        }
        catch(IOException I)
        {
            System.out.println("Caught");
        }
    }    
}
