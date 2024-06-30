import java.sql.*;
import java.io.*;
public class SqlInjection
{
    public static void main(String[] args) 
    {
        Connection cn = null;
        Statement  st = null;
        try    
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter username : ");
            String s1 = br.readLine();
            System.out.println("Enter password : ");
            String s2 = br.readLine();
            Class.forName("com.mysql.cj.jdbc.Driver");
            cn= DriverManager.getConnection("jdbc:mysql://localhost/jt","root", "Jiban@123");
            st = cn.createStatement();
            ResultSet rs = st.executeQuery("select * from login where name = '"+s1+"' and password = '"+s2+"' or 1=1");
            if(rs.next())
            {
                System.out.println("Mr. "+s1+" you are an authorized user.");
            }
            else
            {
                System.out.println("You are not an authorized user.");
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                st.close();
                cn.close();
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}