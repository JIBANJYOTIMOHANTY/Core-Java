import java.util.*;
import java.util.stream.*;
public class Filter 
{
    public static void main(String[] args) 
    {
        ArrayList<String> aa = new ArrayList<String>();
        aa.add("Java")       ;
        aa.add("Raj");
        aa.add("Jitu");
        aa.add("Jitesh");
        aa.add("Ramesh");
        aa.add("Ravi");
        List<String> li = aa.stream().filter(s -> s.startsWith("R")).collect(Collectors.toList());
        System.out.println("\033c"+aa);
        System.out.println(li);
    }
}