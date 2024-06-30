import java.sql.*;
import java.util.Scanner;

public class Delete 
{
    public static void main(String[] args) 
    {
        Connection cn = null;
        Statement st = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String s = sc.nextLine();

        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jt","root","Jiban@123");
            st = cn.createStatement(1005,1008);
            ResultSet rs = st.executeQuery("select roll,name from jt_data");    
            while(rs.next())
            {
                int roll = rs.getInt(1);
                String name = rs.getString(2);
                if(name.equals(s))
                {
                    rs.deleteRow();
                    System.out.println("Row is deleted.");
                }
            }
        }
        catch(Exception e)    
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                st.close();
                cn.close();
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }    
}
