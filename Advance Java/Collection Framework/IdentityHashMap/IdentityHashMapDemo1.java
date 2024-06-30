import java.util.*;
public class IdentityHashMapDemo1 
{
    public static void main(String[] args) 
    {
        IdentityHashMap<String,String> map = new IdentityHashMap<>();
        map.put(new String("first"), "Ram");
        map.put(new String("first"), "Raja");
        map.put(new String("first"), "Rahi");
        System.out.println("Retriving the element form the map object.");
        Set<String> set = map.keySet();
        Iterator<String> itr = set.iterator();
        while(itr.hasNext())
        {
            String key = itr.next();
            String value = map.get(key);
            System.out.println("Key is : " + key + "\tvalue : " + value);
        }
    }
}
