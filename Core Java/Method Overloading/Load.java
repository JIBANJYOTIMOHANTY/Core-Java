class X
{
    void add(int x, int y)
    {
        System.out.println("Addition is : " +(x + y));
    }
    void add(String a, String b)
    {
        System.out.println("Message is : " + (a + b));
    }
    void add(short a, short b)
    {
        System.out.println("Sum is : "+ (a+b));
    }

}
public class Load {

    public static void main(String[] args) {
        X aa = new X();
        byte b1 = 12, b2 = 20;
        aa.add(b1,b2);
        aa.add("Hello ","Jiban");
    }
}