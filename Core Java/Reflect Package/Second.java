import java.lang.reflect.*;
class A
{
    private void cube(int u)
    {
        System.out.println("cube of " + u + " is : " + u * u * u) ;
    }
}
public class Second 
{
    @Deprecated
    public static void main(String[] args) 
    {
        try
        {
            Class cc = Class.forName("A");
            A obj = (A) cc.newInstance();
            Method mm = cc.getDeclaredMethod("cube", new Class[] {int.class});
            mm.setAccessible(true);
            System.out.println("\033c");
            mm.invoke(obj, 5);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }    
}
