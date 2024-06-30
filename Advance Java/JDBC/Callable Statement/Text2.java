// step - 1
import java.sql.*;
import java.util.*;
public class Text2 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the roll number : ");
        int roll = sc.nextInt();
        Connection cn = null;
        CallableStatement cs = null;
        try
        {
            // step-2
            Class.forName("com.mysql.cj.jdbc.Driver");
            // step-3
            cn = DriverManager.getConnection("jdbc:mysql://localhost:3306:/jt","root","Jiban@123");
            // step-4
            String query = "{call jr_app2(?,?,?,?)}";
            cs = cn.prepareCall(query);
            // step-5
            cs.setInt(1,roll);
            //step - 6;
            cs.registerOutParameter(2, Types.VARCHAR);
            cs.registerOutParameter(3, Types.VARCHAR);
            cs.registerOutParameter(4, Types.VARCHAR);

            // step-7
            cs.execute();
            // step-8
            System.out.println("Name is : " + cs.getString(2) + "\tEmail : " + cs.getString(3) + "\tStream : " + cs.getString(4));

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