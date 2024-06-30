import java.sql.*;
// import oracle.jdbc.driver.OracleDriver;
public class ConnectionDemo1
{
    public static void main(String args[])
    {
        Connection cn = null;
        try
        {
            // OracleDriver driver = new OracleDriver();
            // DriverManager.registerDriver(driver);
            cn = DriverManager.getConnection("jdbc:oracle:this:@localhost:1521:XE","root","Jiban@123");
            if(cn!= null)
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