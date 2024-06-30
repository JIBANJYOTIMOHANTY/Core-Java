import java.sql.*;
import java.io.*;

class Stud implements Serializable
{
    String name ;
    int roll ;
    double fee;
    Stud()
    {
        System.out.println("Object is constructed.");
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public void setRoll(int roll)
    {
        this.roll = roll;
    }
    public void setFee(double fee)
    {
        this.fee = fee;
    }
    @Override
    public String toString()
    {
        return "Name : " + name + "\tRoll : " + roll + "\tFee : " + fee;
    }
}

public class Serial 
{
    public static void main(String[] args) 
    {
        Connection cn = null;
        PreparedStatement  ps = null;    
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            cn= DriverManager.getConnection("jdbc:mysql://localhost/jt","root", "Jiban@123");
            ps = cn.prepareStatement("insert into jt_data4 values(?)");
            Stud ss = new Stud();
            ss.setName("Jiban Jyoti");
            ss.setRoll(102);
            ss.setFee(30000.99);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(ss);
            byte bb[] = bos.toByteArray();
            ps.setBytes(1,bb);
            ps.executeUpdate();
            System.out.println("Object is serialized.");
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
