package repository;
import java.sql.*;
public class ConnectionDB {
    static Connection cn ;
    public static Connection connectionGet()
    {
        try 
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/OnlineExam","root","Jiban@123");
            System.out.println("Connected.");
        }  
        catch(Exception ee) 
        {
            ee.printStackTrace();
        }
        finally
        {
            return cn;
        }
    }
}
