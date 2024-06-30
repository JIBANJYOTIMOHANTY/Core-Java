@FunctionalInterface
interface X
{
    void fun();
    private void call()
    {
        System.out.println("This is private method.");
    }
    default void show()
    {
        System.out.println("This is default method.");
    }
    static void display()
    {
        System.out.println("This is static method.");
    }
}
public class Demo implements X
{
    @Override
    public void fun()
    {
        System.out.println("This is fun method.");
    }
    public static void main(String[] args) 
    {
        Demo dd = new Demo();
        dd.fun();
        dd.show();
        X.display();    
    }
}