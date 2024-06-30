import java.util.*;
public class DequeDemo
{
    public static void main(String[] args) 
    {
        Deque<String> de = new ArrayDeque<>();
        de.addFirst("Java");
        de.add("Python");
        de.add("Spring");
        de.add("Hibernate");
        de.addLast(".Net");
        System.out.println(de);
        System.out.println("Remove the first element : " + de.pollFirst());
        System.out.println("Remove the last element : " + de.removeLast());
        Iterator<String> itr = de.iterator();
        System.out.println("\nSee the elements of the Deque.\n");
        while(itr.hasNext())
        {
            String s = itr.next();
            System.out.print(s + "\t");
        }
    }
}