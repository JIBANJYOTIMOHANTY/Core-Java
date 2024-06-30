import java.util.*;
public class HashtableDemo 
{
    public static void main(String[] args) 
    {
        Hashtable <String,String> table = new Hashtable<>();
        table.put("Japan", "Tokiyo");
        table.put("Pakistan","Islambad");
        table.put("India","New Delhi");
        // table.put(null, null);// Generatre NullPointerException
        System.out.println("\nSee the elements : ");
        Enumeration<String> ee = table.keys();
        while (ee.hasMoreElements())
        {
            String key=ee.nextElement();
            String value = table.get(key);
            System.out.println("Key is : " + key + "\t Value is : " + value);
        }
    }    
}
