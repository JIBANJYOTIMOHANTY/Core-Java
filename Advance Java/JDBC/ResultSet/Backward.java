import java.sql.*;
public class Backward 
{
    public static void main(String[] args) 
    {
        Connection cn = null;
        Statement st = null;
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jt","root","Jiban@123");
            st = cn.createStatement(1004,1007);
            ResultSet rs = st.executeQuery("select * from jt_data");
            rs.afterLast();
            // System.out.println(rs.getRow());
            while (rs.previous())
            {
                int roll = rs.getInt(1);
                String name = rs.getString(2);
                System.out.println("Roll : "+roll+"\tName : "+name);
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
