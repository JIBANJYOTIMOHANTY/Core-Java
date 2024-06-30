package service;
import java.sql.*;
import javax.swing.JOptionPane;

public class UpdateService {
    public static String roll1;
    public static boolean update(String name, String address,String roll, String phno)
    {
        try
        {
            Connection cn = repository.ConnectionDB.getConnectionDB();
            Statement st  = cn.createStatement();
            ResultSet rs = st.executeQuery("select * from student");
            int count = 0;
            for(int i = 0; i < phno.length(); i++)
            {
                if(phno.charAt(i) >= 48 && phno.charAt(i) <= 57)
                {
                    count++;
                }
                else 
                {
                    count = 0;
                }
            }
            if(count == 10)
            {
                while(rs.next())
                {
                    roll1 = rs.getString(2);
                    if(phno.length() == 10)
                    {
                        if(roll.equals(roll1))
                        {
                            st.executeUpdate("update student set name = '"+name+"', address = '"+address+"', phno = '"+phno+"' where roll = '"+roll+"'");
                            return true;
                        }
                    }  
                    else
                    {
                        return false;
                    }
                }
            }
            else
            {
                return false;
            }
            return false;
        }   
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
        return false;
    }
    public static String getName(String roll3)
    {
        String name = "";
        try
        {
            Connection cn = repository.ConnectionDB.getConnectionDB();
            Statement st  = cn.createStatement();
            ResultSet rs = st.executeQuery("select name from student where roll = '"+roll3+"'");
            while(rs.next())
            {
                name = rs.getString(1);
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return name;
    }
    public static String getAddress(String roll)
    {
        String adrs = "";
        try
        {
            Connection cn = repository.ConnectionDB.getConnectionDB();
            Statement st  = cn.createStatement();
            ResultSet rs = st.executeQuery("select address from student where roll = '"+roll+"'");
            while(rs.next())
            {
                adrs = rs.getString(1);
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return adrs;
    }
    public static String getPhone(String roll)
    {
        String phno = "";
        try
        {
            Connection cn = repository.ConnectionDB.getConnectionDB();
            Statement st  = cn.createStatement();
            ResultSet rs = st.executeQuery("select phno from student where roll = '"+roll+"'");
            while(rs.next())
            {
                phno = rs.getString(1);
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return phno;
    }
    
}
