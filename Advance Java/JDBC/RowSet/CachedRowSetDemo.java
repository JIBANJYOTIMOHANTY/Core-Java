import java.sql.*;
import javax.sql.*;
import javax.sql.rowset.*;
public class CachedRowSetDemo 
{
    public static void main(String[] args) 
    {
        Connection cn = null;
        Statement st = null;
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jt","root","Jiban@123");
            st = cn.createStatement();
            ResultSet rs = st.executeQuery("select * from jt_data2");
            CachedRowSet cr = RowSetProvider.newFactory().createCachedRowSet();
            cr.populate(rs);
            while(cr.next())
            {
                int roll = cr.getInt(1);
                String name = cr.getString(2);
                System.out.println("Name is : "  + name + "\tRoll is : " + roll);
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