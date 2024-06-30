import java.sql.*;
public class Scroll 
{
    public static void main(String[] args) 
    {
        Connection cn = null;
        Statement st = null;
              
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jt","root","Jiban@123");
            st = cn.createStatement(1004,1007);
            ResultSet rs = st.executeQuery("select * from jt_data2");
            int pos = rs.getRow();
            System.out.println("Current position is : " + pos); //0
            rs.absolute(2);
            pos = rs.getRow();
            System.out.println("Current position is : " + pos); //2
            System.out.println("Name is : " + rs.getString(2));
            rs.absolute(-3);
            pos = rs.getRow();
            System.out.println("Current position is : " + pos); //3
            System.out.println("Name is : " + rs.getString(2));
            rs.relative(-1);
            pos = rs.getRow();
            System.out.println("Current position is : " + pos); //1
            System.out.println("Name is : " + rs.getString(2));
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