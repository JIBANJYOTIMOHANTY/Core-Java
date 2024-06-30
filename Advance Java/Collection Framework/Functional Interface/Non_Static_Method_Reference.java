@FunctionalInterface
interface A
{
    void call();
}
public class Non_Static_Method_Reference 
{
    public void call()
    {
        System.out.println("This is call method.");
    }
    public static void main(String[] args) 
    {
        Non_Static_Method_Reference dd = new Non_Static_Method_Reference();
        A aa = dd :: call;
        aa.call();
    }    
}
