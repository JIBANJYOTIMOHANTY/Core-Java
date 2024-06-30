import java.util.*;
public class CollectionsDemo1 {
    public static void main(String[] args) {
        ArrayList al = new ArrayList<>();
        al.add("India");
        al.add("China");
        al.add("Japan");
        al.add("Cuba");
        al.add("Nepal");

        System.out.println("\033c");
        int pos1 = Collections.binarySearch(al, "India");
        System.out.println("Position of India is : " + pos1);
        System.out.println(al);
        Collections.sort(al);
        System.out.println(al);
        int pos = Collections.binarySearch(al,"India");
        System.out.println("Position of India is : " + pos);
    }
}
