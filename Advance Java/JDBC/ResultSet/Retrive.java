import java.sql.*;
public class Retrive 
{
    public static void main(String[] args) 
    {
        Connection cn = null;
        Statement st = null;
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jt","root","Jiban@123");
            st = cn.createStatement();
            ResultSet rs = st.executeQuery("select * from jt_data");
            System.out.println("\nRetrive the data from the table.\n");
            while(rs.next())
            {
                int roll = rs.getInt(1);
                String name = rs.getString(2);
                System.out.println("Roll number is : " + roll + "\tName is : " + name);
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
            catch (SQLException ex) 
            {
                ex.printStackTrace();
            }
        }
    }    
}
