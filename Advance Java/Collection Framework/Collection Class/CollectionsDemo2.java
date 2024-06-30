import java.util.*;
public class CollectionsDemo2 {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(17);
        al.add(13);
        al.add(19);
        al.add(11);
        al.add(15);
        System.out.println("\033c");
        System.out.println(al);
        Collections.reverse(al);
        System.out.println("Reverse order is : " + al);
        Collections.sort(al);
        System.out.println("Natural sorting order : " + al);
        Collections.sort(al,new MyComparator());
        System.out.println("Customized sorting order is : " + al);
    }
}
class MyComparator implements Comparator{
    @Override
    public int compare(Object obj1, Object obj2)
    {
        Integer i1 = (Integer) obj1;
        Integer i2 = (Integer) obj2;
        return i2.compareTo(i1);
    }
}
