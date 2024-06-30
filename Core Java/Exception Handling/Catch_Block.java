import java.io.*;
public class Catch_Block 
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
            System.out.println("Result is : " + (num1 / num2));
        }
        catch(NumberFormatException ne)
        {
            System.out.println("Please enter a number.");
        }
        catch(ArithmeticException ae)
        {
            System.out.println("Please do not enter zero(0).");
        }
        catch(Exception e)
        {
            System.out.println("Exception arise.");
        }
    }    
}
