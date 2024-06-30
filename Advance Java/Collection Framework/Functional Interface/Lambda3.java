import java.util.*;
@FunctionalInterface
interface B
{
    public String getMessage(String Message);
}
public class Lambda3 
{
    public static void main(String[] args) 
    {
        B bb = (message) -> {return "Message is : "+ message;};
        String a = bb.getMessage("I love my Family.");
        System.out.println(a);
    }    
}
