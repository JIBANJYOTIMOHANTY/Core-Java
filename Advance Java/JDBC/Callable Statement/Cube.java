import java.sql.*;
import java.util.*;
public class Cube 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        
        Connection cn = null;
        CallableStatement cs = null;
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jt","root","Jiban@123");
            String query = "call cubes(?,?)";
            cs = cn.prepareCall(query);
            cs.setInt(1,n);
            cs.registerOutParameter(2, Types.INTEGER);
            cs.execute();
            int result = cs.getInt(2);
            System.out.println("Result : " + result);
        }
        catch(Exception e )
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                cs.close();
                cn.close();
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }    
}
