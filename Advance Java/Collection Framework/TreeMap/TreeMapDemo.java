import java.util.*;
public class TreeMapDemo 
{
    public static void main(String[] args) 
    {
        TreeMap<Integer,String> map = new TreeMap<>();
        map.put(1007,"Japan");
        map.put(1005,"Singrapore");
        map.put(1001,"India");
        map.put(1003,"China");
        map.put(1006,"Korea");
        map.put(1004, "Nepal");
        map.put(1002,"Pakistan");
        System.out.println("\nSee the elements of TreeMap object.");
        Set<Integer> ss = map.keySet();
        Iterator <Integer> ii = ss.iterator();
        while (ii.hasNext()) 
        {
            Integer key = ii.next();
            String value = map.get(key)    ;
            System.out.println("Key is : " + key + " Value is : " + value);
        }
    }    
}
