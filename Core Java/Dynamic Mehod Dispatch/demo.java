class X
{
    public void call()
    {
        System.out.println("Hi Jiban");
    }
    void show()
    {
        System.out.println("Hello Jiban");
    }
}
class Y extends X
{
    void display()
    {
        System.out.println("Namaste Jiban");
    }
}
public class demo 
{
    public static void main(String[] args) 
    {
        X aa = new Y();
        aa.call();
        aa.show();
        //aa.display() /*---> It will cause an error because the reference is pointing to the base class , so it will access all the properties of the base class and it is unable to access the properties of the child class.*/
    }
}