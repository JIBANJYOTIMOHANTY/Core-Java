import java.sql.*;
import java.io.*;
public class Shopping 
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your shopping amount : ");
        double amount = Double.parseDouble(br.readLine());
        System.out.println("Enter the card number : ");
        int no = Integer.parseInt(br.readLine());
        System.out.println("Enter the pin number : ");
        int pin = Integer.parseInt(br.readLine());

        Connection cn = null;
        PreparedStatement ps = null;
        
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jt","root","Jiban@123");
            cn.setAutoCommit(false);
            ps = cn.prepareStatement("select balance from userinfo where c_no = (?) and c_pin = (?)");
            ps.setInt(1,no);
            ps.setInt(2,pin);
            ResultSet rs = ps.executeQuery();
            rs.next();
            double balance = rs.getDouble(1);
            System.out.println(balance);
            if(balance >= amount)
            {
                ps = cn.prepareStatement("update userinfo set balance = (?) where c_pin = (?) and c_no = (?)");
                ps.setDouble(1, (balance - amount));
                ps.setInt(2,pin);
                ps.setInt(3,no);
                ps.executeUpdate();
                ps = cn.prepareStatement("update shopinfo set balance  = balance  + ? where name = 'pantaloon'");
                ps.setDouble(1,amount);
                ps.executeUpdate();
                System.out.println("Transction is successfully commited.");
            }
            else
            {
                System.out.println("!!!Insufficient Balance.!!!");
                System.exit(0);
            }
            

        }
        catch(Exception e)
        {
            e.printStackTrace();
            try
            {
                System.out.println("!!!!!Transction is Rollback.!!!!!");
                System.out.println("!!!Wrong card number or pin number.!!!");
                cn.rollback();
            }
            catch(Exception ee)
            {
                ee.printStackTrace();
            }
        }
        finally
        {
            try
            {
                cn.commit();
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