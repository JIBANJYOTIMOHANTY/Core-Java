public class Finally_Demo3
{
    static int call()
    {
        try
        {

            System.out.println("I am in try block.");
            System.out.println((100/0));
            return 1;
        }
        catch(ArithmeticException ae)
        {
            System.out.println("Catch block.");
            return 2;
        }
        finally
        {
            System.out.println("Finally block.");
            return 3;
        }
    }
    public static void main(String[] args) 
    {
        int res = call();
        System.out.println("Result is : " + res);
    }    
}
