import java.util.*;
class MyComparatorDemo1 implements Comparator
{
    @Override
    public int compare(Object obj1, Object obj2)
    {
        Integer i1 = (Integer) obj1 ;
        Integer i2 = (Integer) obj2 ;
        if(i1 < i2)
        {
            return +1;
        }
        else if(i1 > i2)
        {
            return -1;
        }
        else
        {
            return 0;
        }
    }
}
public class TreeSetDemo1 
{
    public static void main(String[] args) 
    {
        TreeSet<Integer> ts = new TreeSet<>(new MyComparatorDemo1());
        ts.add(15);
        ts.add(13);
        ts.add(11);
        ts.add(18);
        ts.add(16);
        ts.add(12);
        ts.add(13);
        System.out.println("\nSee the elements.\n");
        Iterator<Integer> ii = ts.iterator();
        while(ii.hasNext())
        {
            Integer data = ii.next();
            System.out.print(data + "\t");
        }
    }    
}