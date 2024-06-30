@FunctionalInterface
interface X
{
    public void call();
}
public class Static_Method_Reference 
{
    public static void display()
    {
        System.out.println("Hello I am Jiban");
    }
    public static void main(String[] args) 
    {
        X aa = Static_Method_Reference::display;
        aa.call();
    }    
}
