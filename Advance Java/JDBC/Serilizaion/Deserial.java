import java.io.*;
import java.sql.*;
public class Deserial 
{
    public static void main(String[] args) 
    {
        Connection cn = null;
        PreparedStatement  ps = null;
        try       
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            cn= DriverManager.getConnection("jdbc:mysql://localhost/jt","root", "Jiban@123");
            ps = cn.prepareStatement("select * from jt_data4");
            ResultSet rs = ps.executeQuery();
            while (rs.next())
            {
                byte b[] = rs.getBytes(1); // I extract Stud class object from the table
                ByteArrayInputStream bis = new ByteArrayInputStream(b);
                ObjectInputStream ois = new ObjectInputStream(bis);
                Stud kk = (Stud)ois.readObject();
                System.out.println("Name : " + kk.name +"\tRoll : " + kk.roll + "\tFee : " + kk.fee);
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
                ps.close();
                cn.close();
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}