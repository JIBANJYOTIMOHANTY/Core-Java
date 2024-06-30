package repository;
import java.sql.*;
public class ConnectionDB {
   static Connection cn = null;
    public static Connection getConnectionDB() {
          try {
              Class.forName("com.mysql.cj.jdbc.Driver");
              cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_mgmt", "root", "Jiban@123");
              System.out.println("Connected");
          }  catch(ClassNotFoundException ee) {
              ee.printStackTrace();
          }
          catch(SQLException ee) {
              ee.printStackTrace();
          }
          finally {
              return cn;
          }
    }
    public static void main(String[] args) {
        getConnectionDB();
    }
}
