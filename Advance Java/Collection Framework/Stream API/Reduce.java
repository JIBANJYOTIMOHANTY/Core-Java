import java.util.*;
public class Reduce
{
    public static void main(String[] args) 
    {
        ArrayList<String> aa = new ArrayList<String>();    
        aa.add("Pakistan");
        aa.add("China");
        aa.add("Afghanistan");
        aa.add("Cuba");
        aa.add("India");
        Optional<String> op = aa.stream().reduce((word1,word2) -> word1.length()<word2.length() ? word1 : word2);
        System.out.println(op.get());
    }
}