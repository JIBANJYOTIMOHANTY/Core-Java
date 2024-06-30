import java.sql.*;
import java.util.*;
public class First 
{
    public static void main(String[] args) 
    {
        Connection cn = null;
        CallableStatement cs = null;
        Scanner ss = new Scanner(System.in)    ;
        System.out.println("Enter the number : ");
        int num = ss.nextInt();
        System.out.println("Enter the number : ");
        int num2 = ss.nextInt();
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jt","root","Jiban@123");
            String query="call sum_app1(?,?,?)";
            cs = cn.prepareCall(query);
            cs.setInt(1,num);
            cs.setInt(2,num2);
            cs.registerOutParameter(3, Types.INTEGER);
            cs.execute();
            int result=cs.getInt(3);
            System.out.println("Sum is : " + result);
        }
        catch(Exception e)
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