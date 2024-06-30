public class Finally_Demo1 
{
    static void call()
    {
        String s = null;
        try
        {
            System.out.println("I am in the call method try block.");
            System.out.println("Size of the string is : " + s.length());
        }
        catch(NullPointerException ne)
        {
            System.out.println("Null pointer exception arise in the call method try block.");
        }
        finally
        {
            System.out.println("I am in the call method finally block.");
        }
    }
    static void show()
    {
        byte []b = {65,66,67};
        try
        {
            String s1 = new String(b,0,3);
            System.out.println(s1);
        }
        catch(StringIndexOutOfBoundsException se)
        {
            System.out.println("String out of bound exception in show method try block.");
        }
        finally 
        {
            System.out.println("I am in the show method finally block.");
        }
    }
    public static void main(String[] args) 
    {
        try
        {
            System.out.println("Result is : " + (100/1));
        }
        catch(ArithmeticException ae)
        {
            System.out.println("main method exception");
        }
        finally
        {
            System.out.println("Main method finally block.");
        }
        call();
        show();
    }    
}
