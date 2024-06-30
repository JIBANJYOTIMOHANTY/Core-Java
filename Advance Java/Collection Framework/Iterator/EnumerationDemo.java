import java.util.*;
public class EnumerationDemo 
{
    public static void main(String[] args) 
    {
        Vector vv = new Vector();
        vv.add("Java");
        vv.add("JMS");
        vv.add("Java Mail");
        vv.add("JNDI");
        vv.add("Java Remote");
        vv.add("EJB");
        vv.add("Java WEB");
        System.out.println("See the elements of vector : ");
        Enumeration ee = vv.elements();
        while(ee.hasMoreElements())
        {
            String data = (String)ee.nextElement();
            System.out.println(data);
        }
    }    
}