import java.util.*;
public class Generics 
{
    public static void main(String[] args) 
    {
        ArrayList<String> aa = new ArrayList<String>();
        aa.add("Java")    ;
        aa.add("Python")    ;
        System.out.println("\nSee the elements : ");
        for(int i = 0; i < aa.size(); i++)
        {
            String s = aa.get(i);
            System.out.println(s);
        }
    }
}
