import java.util.*;
public class ListIteratorDemo 
{
    public static void main(String[] args) 
    {
        ArrayList aa = new ArrayList();
        aa.add(new String("Java"));
        aa.add(new String("Servlet"));
        aa.add(new String("JMS"));
        aa.add(new String("Java Mail"));
        aa.add(new String("EJB"));
        aa.add(new String("JSP"));
        ListIterator li = aa.listIterator();
        System.out.println("\033c");
        System.out.println("\nTraverse the elements in forward direction :--->\n");
        while(li.hasNext())
        {
            String s1 = (String) li.next();
            System.out.print(s1 + "\t");
        }
        li.add("Spring Boot");
        System.out.println("\n\nSee the elements in backward direction :--->\n");
        while(li.hasPrevious())
        {
            String s2 = (String) li.previous();
            System.out.print(s2 + "\t");
        }
    }    
}
