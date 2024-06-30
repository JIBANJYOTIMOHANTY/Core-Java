import java.util.*;
import java.util.function.*;
import java.util.stream.*;
public class Map2 
{
    public static void main(String[] args) 
    {
        ArrayList<Integer> aa = new ArrayList<Integer>();
        aa.add(45);
        aa.add(34);
        aa.add(50);
        aa.add(47);
        aa.add(65);
        List<Integer> li = aa.stream().map(i -> (i+15)).collect(Collectors.toList());
        System.out.println(li);
        System.out.println(aa);
    }
}