import java.sql.*;
import java.io.*;
public class SqlInjection2
{
    public static void main(String[] args) 
    {
        Connection cn = null;
        PreparedStatement  st = null;
        try    
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter user name : ");
            String s1 = br.readLine();
            System.out.println("Enter password : ");
            String s2 = br.readLine();
            Class.forName("com.mysql.cj.jdbc.Driver");
            cn= DriverManager.getConnection("jdbc:mysql://localhost/jt","root", "Jiban@123");
            st = cn.prepareStatement("select * from login where name = (?) and password = (?)");
            st.setString(1, s1);
            st.setString(2, s2);
            ResultSet rs = st.executeQuery();
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