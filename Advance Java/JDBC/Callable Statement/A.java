import java.util.*;
public class A {
    public static void main(String[] args) {
        ArrayList aa = new ArrayList();
        aa.add("a");
        aa.add("b");
        aa.add("c");
        aa.add("d");
        aa.add("e");
        ListIterator ii =(ListIterator) aa.listIterator();
        while(ii.hasNext())
        {
            String ss = (String)ii.next();
            System.out.println(ss);
        }
        ii.add("f");
        while(ii.hasPrevious())
        {
            String ss = (String)ii.previous();
            System.out.println(ss);
        }
    }
}
