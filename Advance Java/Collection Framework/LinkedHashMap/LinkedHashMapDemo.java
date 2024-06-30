import java.util.*;
public class LinkedHashMapDemo
{
    public static void main(String[] args) 
    {
        LinkedHashMap<String, String> map = new LinkedHashMap<>();
        map.put("India","New Delhi");
        map.put("Odisha","Bhubaneswar");
        map.put("Assam", "Thispur");
        map.put("Uttar Pradesh","Lucknow");
        System.out.println("\nSee the elements");
        Set<String> set = map.keySet();
        Iterator<String> itr = set.iterator();
        while(itr.hasNext())
        {
            String key = itr.next();
            String value = map.get(key);
            System.out.println("Key is : " + key + "\t\tValue is : " + value);
        }
    }
}