import java.util.*;
import java.sql.*;
public class Function2
{
    public static void main(String args[])
    {
        Scanner ss = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = ss.nextInt();
        Connection cn = null;
        CallableStatement cs = null;
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jt","root","Jiban@123");
            String query = "{?= call jt_function2(?)}";
            cs = cn.prepareCall(query);
            cs.setInt(2,num);
            cs.registerOutParameter(1, Types.VARCHAR);
            cs.execute();
            String result = cs.getString(1);
            System.out.println(num + " is : " + result);
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
