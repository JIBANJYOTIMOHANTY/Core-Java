// step-1
import java.sql.*;
import java.util.*;
public class Text1{
	public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number : ");
        int num2 = sc.nextInt();
        System.out.println("Enter the third number : ");
        int num3 = sc.nextInt();
        Connection cn = null;
        CallableStatement cs = null;
        try
        {
            // step-2
            Class.forName("com.mysql.cj.jdbc.Driver");
            // step-3
            cn = DriverManager.getConnection("jdbc:mysql://localhost:3306:/jt","root","Jiban@123");
            // step-4
            String query = "{call jr_app1(?,?,?,?)}";
            cs = cn.prepareCall(query);
            // step-5
            cs.setInt(1,num1);
            cs.setInt(2,num2);
            cs.setInt(3,num3);
            // step-6
            cs.registerOutParameter(4, Types.INTEGER);
            // step-7
            cs.execute();
            // step-8
            int result = cs.getInt(4);
            System.out.println("Biggest number is : " + result);

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