import java.lang.reflect.*;

class A
{
    private void getMessage()
    {
        System.out.println("Hello Java");
    }
}
public class First
{
    @Deprecated
    public static void main(String[] args) 
    {
        try
        {
            Class cc = Class.forName("A");
            A obj = (A) cc.newInstance();
            Method mm = cc.getDeclaredMethod("getMessage", null);
            mm.setAccessible(true);
            System.out.println("\033c");
            mm.invoke(obj, null);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}