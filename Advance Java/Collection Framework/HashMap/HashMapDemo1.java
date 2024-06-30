import java.util.*;
public class HashMapDemo1 
{
    public static void main(String[] args) 
    {
        HashMap<String,String> map = new HashMap<>();
        map.put("first", "Ram");
        map.put("first", "Raja");
        map.put("first", "Rahi");
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
