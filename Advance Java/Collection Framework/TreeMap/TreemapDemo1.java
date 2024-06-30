import java.util.*;
class MyDemo implements Comparator
{
    @Override
    public int compare(Object obj1 , Object obj2)
    {
        String s1 = obj1.toString();
        String s2 = obj2.toString();
        return s2.compareTo(s1);
    }
}
public class TreemapDemo1 
{
    
    public static void main(String[] args) 
    {
        TreeMap <String, String> map = new TreeMap<>();
        map.put("Odisha","Bhubaneswar");
        map.put("uttarPradesh", "Lucknow");
        map.put("Bihar","Patna");
        map.put("Chatisgarh", "Raygara");
        System.out.println("See the elements : ");
        Set <String> key = map.keySet();
        Iterator<String> itr = key.iterator();
        while (itr.hasNext())
        {
            String key1 = itr.next();
            String value = map.get(key1);
            System.out.println("Key is : " + key1 + " Value is : " + value);
        }

    }    
}
