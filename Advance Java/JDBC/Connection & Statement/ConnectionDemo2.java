import java.sql.*;
public class ConnectionDemo2
{
    public static void main(String[] args) {
        Connection cn = null;
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            cn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","root","Jiban@123");
            if(cn != null)
            {
                System.out.println("Connection object is constructed.");
            }
            else
            {
                System.out.println("Connection object is not constructed.");
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            try{
                cn.close();
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}