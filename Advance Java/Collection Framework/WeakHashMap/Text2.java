import java.util.*;
class Temp
{
    @Override
    public String toString()
    {
        return "Java Technocrat.";
    }
    @Override
    public void finalize()
    {
        System.out.println("Object is flushed.");
    }
}
public class Text2
{
    public static void main(String[] args) 
    {
        WeakHashMap<Temp,String> map = new WeakHashMap<>();
        Temp tt=new Temp();
        map.put(tt,"Java");
        System.out.println(map);
        tt = null;          // Temp class object is an orphan object.
        System.gc();       //  I call garbage collector to flush the temp class object.
        try
        {
            Thread.sleep(1000);
        }
        catch(InterruptedException ie)
        {
            System.out.println("Interrupted exception arised.");
        }
        System.out.println(map);
    }    
}
