import java.sql.*;
import java.util.*;
public class Greatest_3 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number : ");
        int n1 = sc.nextInt();
        System.out.println("Enter the second number : ");
        int n2 = sc.nextInt();
        System.out.println("Enter the third number : ");
        int n3 = sc.nextInt();
        
        Connection cn = null;
        CallableStatement cs = null;

        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jt","root","Jiban@123");
            String query = "call greatest_3(?,?,?,?)";
            cs = cn.prepareCall(query);
            cs.setInt(1,n1);
            cs.setInt(2,n2);
            cs.setInt(3,n3);
            cs.registerOutParameter(4, Types.INTEGER);
            cs.execute();
            int result = cs.getInt(4);
            System.out.println("Greatest between " + n1 + " " + n2 + " " + n3 +" is : " + result);
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
