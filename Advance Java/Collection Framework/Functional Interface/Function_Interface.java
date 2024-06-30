import java.util.function.Function;

public class Function_Interface 
{
    public static void main(String[] args) 
    {
        String name = "Jiban"       ;
        String s1 = new String(name);
        Function<String,Integer> obj = (x) ->x.length();
        Integer size = obj.apply(s1);
        System.out.println("Size of " + name + " is : " + size);
    }    
}