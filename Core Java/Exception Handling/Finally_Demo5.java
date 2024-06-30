public class Finally_Demo5
{
    static void call()
    {
        try
        {

            System.out.println("I am in try block.");
            throw new Exception();
        }
        catch(ArithmeticException ae)
        {
            System.out.println("Catch block.");
        }
        finally
        {
            System.out.println("Finally block.");
            return ;
        }
    }
    public static void main(String[] args) 
    {
        call();
    }    
}
