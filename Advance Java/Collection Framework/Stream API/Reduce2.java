import java.util.*;
import java.util.function.*;
import java.util.stream.*;
public class Reduce2
{
    public static void main(String[] args) 
    {
        ArrayList<Integer> aa = new ArrayList<Integer>();    
        aa.add(34);
        aa.add(67);
        aa.add(32);
        aa.add(69);
        aa.add(55);
        Integer sum = aa.stream().reduce(0,(i1,i2)->i1+i2);
        System.out.println("Sum of number is : "+ sum);
    }
}