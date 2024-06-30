import java.sql.*;
import java.util.*;
public class ExecuteDemo
{
    public static void main(String args[])
    {
        Scanner ss = new Scanner(System.in);
        Connection cn = null;
        Statement st = null;
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jt","root","Jiban@123");
            st = cn.createStatement(1004,1007);
            System.out.println("Enter the query : ");
            String query = ss.nextLine();
            boolean bb = st.execute(query);
            if(bb)
            {
                System.out.println("See the data.");
                ResultSet rs = st.getResultSet();
                while(rs.next())
                {
                    int roll = rs.getInt(1);
                    String name = rs.getString(2);
                    System.out.println("Roll : " + roll + "\tName : " + name);
                }
            }
            else
            {
                System.out.println("It is a non select statement.");
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