import java.util.*;
public class IteratorDemo 
{
    public static void main(String[] args) 
    {
        ArrayList aa = new ArrayList()    ;
        aa.add(new String("India"));
        aa.add(new String("Japan"));
        aa.add(new String("Cuba"));
        aa.add(new String("Brazil"));
        aa.add(new String("Nepal"));
        aa.add(new String("China"));
        aa.add(new String("Brazil"));
        System.out.println("Size of the ArrayList is : " + aa.size());
        Iterator ii = aa.iterator();
        System.out.println("\nSee the elements of the ArrayList : ");
        while(ii.hasNext())
        {
            String s = (String)ii.next();
            System.out.println(s);
            ii.remove();
        }
        System.out.println("Size of the ArrayList object is : "+ aa.size());
    }    
}
