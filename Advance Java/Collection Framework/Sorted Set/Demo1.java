import java.util.*;
public class Demo1
{
    public static void main(String[] args) 
    {
        TreeSet<Integer> tt = new TreeSet<Integer>();
        tt.add(16)    ;
        tt.add(65)    ;
        tt.add(11)    ;
        tt.add(13)    ;
        tt.add(17)    ;
        tt.add(19)    ;
        System.out.println(tt);

        System.out.println("First element is : " + tt.first());
        System.out.println("Last element is : " + tt.last());
        System.out.println("Head Set is : " + tt.headSet(17));
        System.out.println("Tail Set is : " + tt.tailSet(17));
        System.out.println("Sub Set is : " + tt.subSet(13,19));

    }
}