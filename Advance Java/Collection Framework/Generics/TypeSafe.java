import java.util.*;
public class TypeSafe 
{
    public static void main(String[] args) 
    {
        ArrayList aa = new ArrayList();
        aa.add("Java");
        aa.add(new Boolean("True"));
        System.out.println("\nSee the elements.\n");
        for(int i = 0; i < aa.size(); i++)
        {
            String s = (String)aa.get(i);
            System.out.println(s);
        }
    }    
}