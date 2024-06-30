import java.util.*;
import java.io.*;
public class PropertiesDemo2 
{
    public static void main(String[] args) 
    {
        Properties pp = new Properties();
        try
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter your manager name : ");
            String name1 = br.readLine();
            System.out.println("Enter the manager job : ");
            String job1 = br.readLine();
            FileInputStream fis = new FileInputStream("abc.properties");
            pp.load(fis);
            System.out.println(pp);
            String s1 = pp.getProperty("name");
            String s2 = pp.getProperty("job");
            System.out.println("Name is : " + s1 + " Job is : " + s2);
            pp.setProperty("name", name1);
            pp.setProperty("job", job1);
            FileOutputStream fos = new FileOutputStream("abc.properties");
            pp.store(fos, "Hi I am in JT");
        }
        catch(Exception ee)
        {
            ee.printStackTrace();
        }
    }    
}
