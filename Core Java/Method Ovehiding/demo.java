class X
{
    public static void main(String[] args) 
    {
        System.out.println("Hello ");    
    }
}
public class demo extends X
{
    //@Override // If we comment out @Override it will show a compiler time error because @Override annotation is used to compiler know the mehtod is Overriden.
    public static void main(String[] args) 
    {
        System.out.println("Jiban");    
    }
}