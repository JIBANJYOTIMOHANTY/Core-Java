import java.util.*;
import java.util.stream.*;
public class Sorted2 
{
    public static void main(String[] args) 
    {
        ArrayList <Integer> aa = new ArrayList<Integer> ();
        aa.add(12)    ;
        aa.add(15)    ;
        aa.add(17)    ;
        aa.add(11)    ;
        aa.add(13)    ;
        aa.add(19)    ;
        System.out.println(aa);
        List<Integer> li = aa.stream().sorted((i1, i2) -> ((i1 < i2) ? 1 : (i1 > i2) ? -1 : 0)).collect(Collectors.toList());
        System.out.println(li);
    }
}
