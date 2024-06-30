import java.util.*;
public class Demo3 
{
    public static void main(String[] args) 
    {
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(15);
        ts.add(12);
        ts.add(16);
        ts.add(14);
        ts.add(11);
        ts.add(10);
        ts.add(17);
        ts.add(19);
        ts.add(13);

        System.out.println(ts);
        System.out.println("Ceiling : " + ts.ceiling(15));
        System.out.println("Higher : " + ts.higher(15));
        System.out.println("Floor : " + ts.floor(15));
        System.out.println("Lower : " + ts.lower(15));
        System.out.println("Remove First : " + ts.pollFirst());
        System.out.println("Remove Last : " + ts.pollLast());
        System.out.println("Descending order : " + ts.descendingSet());
    }    
}