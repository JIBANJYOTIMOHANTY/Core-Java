import java.sql.*;
public class Insert1
{
    public static void main(String[] args) 
    {
        Connection cn = null;
        Statement  st = null;
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jt","root","Jiban@123");
            st = cn.createStatement();
            st.executeUpdate("insert into jt_data3 values('Ajit')");
            st.executeUpdate("insert into jt_data3 values('Amit')");
            st.executeUpdate("insert into jt_data3 values('Amitav')");
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