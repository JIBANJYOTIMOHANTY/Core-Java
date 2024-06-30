import java.sql.*;
public class Insert 
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
            // while(rs.next())
            // {
            //     int roll = rs.getInt(1);
            //     String name = rs.getString(2);
            //     System.out.println("Name is : " + name + "\tRoll is : " + roll);
            // }
            rs.moveToInsertRow();
            rs.updateInt(1,106);
            rs.updateString(2,"Jiban");
            rs.insertRow();
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