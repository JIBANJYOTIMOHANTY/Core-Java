import java.util.*;
class MyComparatorDemo2 implements Comparator
{
    @Override
    public int compare(Object obj1, Object obj2)
    {
        String s1 = obj1.toString();
        String s2 = obj2.toString();
        int size1 = s1.length();
        int size2 = s2.length();
        if(size1 < size2)
        {
            return +1;
        }
        else if(size1 > size2)
        {
            // System.out.println(s1);
            return -1;
        }
        else
        {
            return s1.compareTo(s2);
        }

    }
}
public class TreeSetDemo2 
{
    public static void main(String[] args) 
    {
        TreeSet <String> ts = new TreeSet<>(new MyComparatorDemo2());
        ts.add("India");
        ts.add("Pakistan");
        ts.add("Nepal");
        ts.add("Singapore");
        ts.add("japan");
        System.out.println("\nSee the elements : \n");
        Iterator<String> ii = ts.iterator();
        while(ii.hasNext())
        {
            String name = ii.next();
            System.out.print(name + "\t");
        }
    }    
}