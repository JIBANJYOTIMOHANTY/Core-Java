/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;
import java.sql.*;
/**
 *
 * @author jiban
 */
public class LastData 
{
    public static String getData()
    {
        String r = "";
        try
        {
            Connection cn = repository.ConnectionDB.getConnectionDB();
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("select * from student");
            while(rs.next())
            {
                r = rs.getString(2);
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        System.out.println(r);
        return r;
    }
}
