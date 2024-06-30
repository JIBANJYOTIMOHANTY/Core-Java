import java.util.*;
public class Demo2 
{
    public static void main(String[] args) 
    {
        TreeSet<String> ts = new TreeSet<>();
        ts.add("Java");
        ts.add("Ankit");
        ts.add("Chinmay");
        ts.add("Vivek");
        ts.add("Binod");
        ts.add("Deepak");
        ts.add("Alka");
        
        System.out.println(ts);
        System.out.println("First element is : " + ts.first());
        System.out.println("Last element is : " + ts.last());
        System.out.println("Head Set is : " + ts.headSet("Deepak"));
        System.out.println("Tail Set is : " + ts.tailSet("Deepak"));
        System.out.println("Sub Set is : " + ts.subSet("Ankit","Vivek"));
        
    }    
}
