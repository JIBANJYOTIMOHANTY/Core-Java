import java.sql.*;
import java.io.*;
public class Insert2
{
    public static void main(String[] args) 
    {
        Connection cn = null;
        PreparedStatement  st = null;
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jt","root","Jiban@123");
            st = cn.prepareStatement("insert into jt_data3 values(?)");// ? means column
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            
            for(int i = 1 ; i <= 3; i++)
            {
                String ss = br.readLine();
                st.setString(1,ss);
                st.executeUpdate();
            }
            
            // st.executeUpdate("insert into jt_data3 values('Ajit')");
            // st.executeUpdate("insert into jt_data3 values('Amit')");
            // st.executeUpdate("insert into jt_data3 values('Amitav')");
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