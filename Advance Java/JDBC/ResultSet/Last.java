import java.sql.*;
public class Last 
{
    public static void main(String[] args) 
    {
        Connection cn = null;
        Statement st = null;
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jt","root","Jiban@123");
            st = cn.createStatement(1005,1008);
            ResultSet rs = st.executeQuery("select roll,name from jt_data");  
            rs.last();
            rs.moveToInsertRow();
            rs.insertRow();
            // rs.afterLast();
            
            // st.executeQuery("insert into jt_data values(104,'Ajay Kumar')");
            System.out.println("Position : " + rs.getRow());
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
