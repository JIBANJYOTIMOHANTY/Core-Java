class X
{
    int data;
    public void increment()
    {
        data++;
    }
    X()
    {
        increment();
    }
}
class Y extends X
{
    Y()
    {
        increment();
    }

    public void increment()
    {
        data += 10;
    }
}
public class Late
{
    public static void main(String[] args) 
    {
        Y aa = new Y();
        aa.increment();
        System.out.println("Data value is : " + aa.data);
    }
}