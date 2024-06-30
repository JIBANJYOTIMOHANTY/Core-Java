import java.util.*;
import java.util.function.*;
import java.util.stream.*;
public class Filter2 
{
    public static void main(String[] args) 
    {
        ArrayList<Integer> aa = new ArrayList<>();
        aa.add(23);
        aa.add(67);
        aa.add(24);
        aa.add(16);
        aa.add(70);
        aa.add(25);
        List li = aa.stream().filter(x -> x < 30).collect(Collectors.toList());
        System.out.println(aa);
        System.out.println(li);
    }   
}