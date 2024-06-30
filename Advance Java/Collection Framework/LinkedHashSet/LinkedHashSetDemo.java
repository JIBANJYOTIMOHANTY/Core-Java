import java.util.*;
public class LinkedHashSetDemo 
{
    public LinkedHashSetDemo()
    {
        ArrayList<String> aa = new ArrayList<>();
        aa.add("Ramesh");
        aa.add("Rajesh");
        aa.add("Rama");
        aa.add("Ramesh");
        aa.add("Raj");
        aa.add("Rajesh");
        aa.add("Rani");
        System.out.println("\nSee the elements of the List.\n");
        Iterator<String> ii = aa.iterator();
        while(ii.hasNext())
        {
            String name = ii.next();
            System.out.print(name + "\t");
        }
        System.out.println("\n");
        call(aa);
    }
    void call(Collection cc)
    {
        HashSet<String> hs = new HashSet<>(cc);
        System.out.println("\nSee the elements of Set.\n");
        Iterator<String> kk = hs.iterator();
        while(kk.hasNext())
        {
            String data = kk.next();
            System.out.print(data + "\t");
        }
        // System.out.println("\n");
    }
    public static void main(String[] args) 
    {
        new LinkedHashSetDemo();
    }
}