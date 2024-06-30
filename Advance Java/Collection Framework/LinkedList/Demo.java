import java.util.*;

public class Demo
{
    public static void main(String[] args) 
    {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("China")    ;
        ll.add("Nepal")    ;
        ll.add("Cuba")    ;
        ll.add("Japan")    ;
        ll.add("Korea")    ;
        ll.add("India")    ;
        ll.add("Afghanistan")    ;
        System.out.println("\nSee the elements of linked list object");
        Iterator <String> ii = ll.iterator();
        while(ii.hasNext())
        {
            String name = ii.next();
            System.out.println(name);
        }
        System.out.println("Remove the first element : " + ll.pollFirst());
        System.out.println("Remove the last element : " + ll.pollLast());
    }
}