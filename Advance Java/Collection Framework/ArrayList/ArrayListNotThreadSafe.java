import java.util.*;
public class ArrayListNotThreadSafe 
{
    public static void main(String[] args) throws InterruptedException
    {
        ArrayList aa = new ArrayList();
        Thread t1 = new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                for(int i = 1; i <= 10; i++)
                {
                    aa.add(i);
                    try
                    {
                        Thread.sleep(50);
                    }
                    catch(InterruptedException ie)
                    {
                        System.out.println("Interrupted Exception arise.");
                    }
                }
            }
        });

        Thread t2 = new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                for(int i = 10; i >= 1; i--)
                {
                    aa.add(i);
                    try
                    {
                        Thread.sleep(50);
                    }
                    catch(InterruptedException ie)
                    {
                        System.out.println("Interrupted Exception arise.");
                    }
                }
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.print(aa + "\t");
        System.out.println();
    }
}
