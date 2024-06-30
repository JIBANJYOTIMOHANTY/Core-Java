import java.util.*;
@FunctionalInterface
interface A
{
    public String say();
}
public class Lambda2 
{
    public static void main(String[] args) 
    {
        A ll = () -> {return "I love India";};
        System.out.println("Message is : " + ll.say());
    }    
}