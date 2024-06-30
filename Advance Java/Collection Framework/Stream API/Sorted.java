import java.util.*;
import java.util.stream.*;
public class Sorted 
{
    public static void main(String[] args) 
    {
        ArrayList <Integer> aa = new ArrayList<>();
        aa.add(23);
        aa.add(20);
        aa.add(78);
        aa.add(100);
        aa.add(44);
        aa.add(54);
        List li = aa.stream().sorted().collect(Collectors.toList());
        System.out.println(aa);
        System.out.println(li);
    }    
}