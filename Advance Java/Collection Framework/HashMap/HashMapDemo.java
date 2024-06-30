import java.util.*;
public class HashMapDemo 
{
    public static void main(String[] args) 
    {
        HashMap <String,String> map = new HashMap<>();
        map.put("first","kavita");
        map.put("second","Alka");
        map.put("third","Java");
        map.put("fourth","Rani");
        map.put("fifth","mamun");
        System.out.println("Retriving the elements form map object");
        Set<String> set = map.keySet();
        Iterator<String> ii=set.iterator();
        while(ii.hasNext())
        {
            String key = ii.next();
            String value = map.get(key);
            System.out.println("key : " + key + "\tvalue : " + value);
        }
    }
}
