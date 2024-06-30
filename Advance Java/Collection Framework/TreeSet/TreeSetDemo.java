import java.util.*;
public class TreeSetDemo
{
    public static void main(String[] args) 
    {
        TreeSet  ts = new TreeSet();//Comparable interface
        ts.add("Java")    ;
        ts.add("Python")    ;
        ts.add("Spring")    ;
        ts.add("Velocity")    ;
        ts.add("Hibernate")    ;
        // ts.add(null);//Exception arised(nullpointerexception)
        // ts.add(new Integer(101));//Exception arised(classcastexception)
        System.out.println("\nSee the elements of TreeSet Object.");
        Iterator<String> itr =ts.iterator();
        while(itr.hasNext())
        {
            String name = itr.next();
            System.out.println("Name is : " + name);
        }
    }
}