class X
{
    X(int a)
    {
        System.out.println("Object");
    }
}
public class A extends X {
    A()
    {
        super(20);
    }
    
    public static void main(String[] args) {
        X aa = new X(1000);

    }
}
