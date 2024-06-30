import java.util.*;
import java.util.function.*;
public class Consumer_Interface
{
    public static void main(String[] args) 
    {
        Consumer<Integer> c = a -> System.out.println(a);
        c.accept(new Integer(10));
        Consumer<List<Integer>> modify = list ->
        {
            for(int i = 0; i < list.size(); i++)
            {
                list.set(i, 2 * list.get(i));
                System.out.println(list.get(i));
            }
        };
        List<Integer> a1 = new ArrayList<>();
        a1.add(4);
        a1.add(6);
        a1.add(8);
        a1.add(2);
        a1.add(10);
        modify.accept(a1);
    }
}