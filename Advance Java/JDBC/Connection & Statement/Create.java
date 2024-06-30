import java.sql.*;
public class Create
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
            int x = st.executeUpdate("create table empdemo(roll integer(3), name varchar(20))");
            System.out.println(x);
            System.out.println("Table is created.");
            x = st.executeUpdate("insert into empdemo values(101, 'Jiban Jyoti')");
            System.out.println(x);
            st.executeUpdate("insert into empdemo values(102, 'Jiban Jyoti Mohanty')");
            st.executeUpdate("insert into empdemo values(103, 'Manoj')");
            st.executeUpdate("update empdemo set name = 'Ram Kumar' where roll = 102");
            st.executeUpdate("delete from empdemo where roll = 102");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                cn.close();
            }
            catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}