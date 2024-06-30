import java.util.*;
import java.io.*;
public class PropertiesDemo 
{
    public static void main(String[] args) 
    {
        Properties pp = new Properties();
        try
        {
            FileInputStream fis = new FileInputStream("abc.properties");
            pp.load(fis);
            System.out.println(pp);
            String s1 = pp.getProperty("name");
            String s2 = pp.getProperty("job");
            System.out.println("Name is : " + s1 + " Job is : " + s2);
            pp.setProperty("name", "Rajesh Kumar");
            pp.setProperty("job", "Manager");
            FileOutputStream fos = new FileOutputStream("abc.properties");
            pp.store(fos, "Hi I am in JT");
        }
        catch(Exception ee)
        {
            ee.printStackTrace();
        }
    }    
}
