/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;
import java.sql.*;
/**
 *
 * @author jiban
 */
public class Connection1 {
    static Connection cn = null;
    public static Connection getConnection()
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jt","root","Jiban@123");
            System.out.println("Connection successful");
        }
        catch(ClassNotFoundException ce)
        {
            System.out.println("Class not found");
        }
       catch(SQLException se)
        {
            System.out.println("Sql Exception");    
        }
        finally
        {
            return cn;
        }
    }
}
