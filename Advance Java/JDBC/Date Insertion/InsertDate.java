import java.io.*;
import java.util.*;
import java.text.*;
import java.sql.*;
public class InsertDate 
{
    public static void main(String[] args) 
    {
        Connection cn = null;
        PreparedStatement ps = null;
        try    
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter your ID number : ");
            int no = Integer.parseInt((br.readLine()));
            System.out.println("Enter your name : ");
            String name = br.readLine();
            System.out.println("Enter your DOB :");
            String dob = br.readLine();
            System.out.println("Enter the Date of Joining : ");
            String doj = br.readLine();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
            java.util.Date uDOB = sdf.parse(dob);
            java.sql.Date sDOB = new java.sql.Date(uDOB.getTime());

            java.util.Date uDOJ = sdf.parse(doj);
            java.sql.Date sDOJ = new java.sql.Date(uDOJ.getTime());

            Class.forName("com.mysql.cj.jdbc.Driver");
            cn= DriverManager.getConnection("jdbc:mysql://localhost:3306/jt","root", "Jiban@123");
            ps = cn.prepareStatement("insert into jt_data5 values(?,?,?,?)");
            ps.setInt(1,no);
            ps.setString(2,name);
            ps.setDate(3, sDOB);
            ps.setDate(4,sDOJ);
            ps.executeUpdate();
            System.out.println("Row is inserted.");


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
