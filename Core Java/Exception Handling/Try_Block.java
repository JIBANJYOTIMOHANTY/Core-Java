public class Try_Block 
{
    public static void main(String[] args) 
    {
        try    
        {
            System.out.println("I am in the outer try block.");
            System.out.println("Result is : " + (100/args.length));
            try
            {
                System.out.println("I am in the nested try block.");
                System.out.println("Value is : " + args[1]);
            }
            catch(ArrayIndexOutOfBoundsException ae)
            {
                System.out.println("Array index out.");
            }
        }
        catch(RuntimeException Re)
        {
            System.out.println("Exception caught.");
        }
    }    
}
