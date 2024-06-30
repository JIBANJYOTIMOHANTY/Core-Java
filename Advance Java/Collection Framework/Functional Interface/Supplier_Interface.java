import java.util.*;
import java.util.function.*;
public class Supplier_Interface 
{
    public static void main(String[] args) 
    {
       String name = "Jiban" ;
       String s1 = new String(name);
       Supplier<Integer> obj = () -> s1.length();
       System.out.println("Size is : " + obj.get());
       Supplier<String> ob = () -> s1.toUpperCase();
       System.out.println("Content is : " + ob.get());
    }    
}