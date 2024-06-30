import java.util.*;
import java.util.function.*;

public class Predicate_Interface 
{
    public static void main(String[] args) 
    {
        Predicate<Integer> p = x -> (x > 10);
        int num = 10;
        System.out.println(p.test(num));
    }
}