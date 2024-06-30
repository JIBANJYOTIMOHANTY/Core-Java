import java.util.*;
public class VectorThreadSafe
{
    public static void main(String[] args) throws InterruptedException
    {
        Vector v = new Vector();
        Thread t1 = new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                for(int i = 1; i <= 10; i++)
                {
                    v.add(i);
                    try
                    {
                        Thread.sleep(50);
                    }
                    catch(InterruptedException ie)
                    {
                        System.out.println("Interrupted Exception arised.");
                    }
                }
            }
        })    ;

        Thread t2 = new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                for(int i = 10; i >= 1; i--)
                {
                    v.add(i);
                    try
                    {
                        Thread.sleep(50);
                    }
                    catch(InterruptedException ie)
                    {
                        System.out.println("Interrupted Exception arised.");
                    }
                }
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(v);
    }
}