import java.io.*;
import java.util.*;
import java.text.*;
import java.sql.*;
public class RetriveDAte 
{
    public static void main(String[] args) 
    {
        Connection cn = null;
        Statement st = null;
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            cn= DriverManager.getConnection("jdbc:mysql://localhost:3306/jt","root", "Jiban@123");
            st = cn.createStatement();
            ResultSet rs = st.executeQuery("select * from jt_data5");
            while(rs.next())
            {
                int no = rs.getInt(1);
                String name = rs.getString(2);
                java.sql.Date sDOB = rs.getDate(3);
                java.sql.Date sDOJ = rs.getDate(4);

                java.util.Date uDOB = (java.util.Date)sDOB;
                SimpleDateFormat sdf = new SimpleDateFormat("YYYY/MM/dd");
                String dob = sdf.format(uDOB);

                java.util.Date uDOJ = (java.util.Date)sDOJ;
                String doj = sdf.format(uDOJ);
                System.out.println("\033c");
                System.out.println("Id : " + no + "\tName : " + name + "\tDOB" + dob + "\t\tDOJ : " + doj);
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
