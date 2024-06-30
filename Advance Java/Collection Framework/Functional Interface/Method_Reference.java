@FunctionalInterface
interface X<A,B>
{
    Object get(A aa, B bb);
}
class Test
{
    public static int add(int a, int b)
    {
        return a + b;
    }
    public static double add(double x, double y)
    {
        return x + y;
    }
}
public class Method_Reference 
{
    public static void main(String[] args) 
    {
        X<Integer,Integer> aa = Test::add;
        System.out.println("Sum is : " + aa.get(10,20));
        X<Double,Double> bb = Test :: add;
        System.out.println("Sum is : " + bb.get(1234.66,9876.54));
    }    
}
