import java.util.*;
public class ArrayList1
{
    public static void main(String args[])
    {
        ArrayList al = new ArrayList();
        System.out.println("ArrayList object size before insertion is : " + al.size());
        al.add(new String("China"));
        al.add(new String("USA"));
        al.add(new String("Japan"));
        al.add(new String("UK"));
        al.add(new String("Nepal"));
        al.add(0,new String("India"));
        System.out.println("ArrayList object size after insertion is : " + al.size());
        for(int i = 0; i < al.size(); i++)
        {
            String name = (String)al.get(i);
            System.out.println(name);
        }
        String remove = (String) al.remove(1);
        System.out.println("\nRemove element is : " + remove);
        for(int i = 0; i < al.size(); i++)
        {
            String name = (String)al.get(i);
            System.out.println(name);
        }
    }
}