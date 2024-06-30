import java.util.*;
public class Lambda6 
{
    public static void main(String[] args) 
    {
        List ll = new ArrayList();
        ll.add("Java");
        ll.add("Python");
        ll.add("PHP");
        ll.add("Servlet");
        ll.add("Spring Boot");
        ll.forEach((n)->System.out.println(n));
    }    
}