import java.util.*;
import java.util.function.*;
import java.util.stream.*;
public class Map
{
    public static void main(String args[])
    {
        ArrayList<Integer> aa = new ArrayList<Integer>();
        aa.add(5);
        aa.add(10);
        aa.add(12);
        aa.add(6);
        aa.add(9);
        List<Integer> cube = aa.stream().map(x -> (x*x*x)).collect(Collectors.toList());
        System.out.println(cube);
        System.out.println(aa);
    }
}