/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author jiban
 */
public class CreateService 
{
    public static boolean Create(String name,String pass)
    {
        try
        {
            Connection cn = repository.ConnectionDB.getConnectionDB();
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("select name from admin");
            while(rs.next())
            {
                String name2 = rs.getString(1);
                if(name.equals(name2))
                {
                    return false;
                }
            }
            st.executeUpdate("insert into admin values('"+name+"','"+pass+"')");
            return true;
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
            
        return false;
    }
}
