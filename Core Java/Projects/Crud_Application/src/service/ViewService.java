package service;
import java.sql.*;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jiban
 */
public class ViewService 
{
    public static ResultSet view()
    {
        try
        {
            Connection cn = repository.ConnectionDB.getConnectionDB();  
            Statement st  = cn.createStatement();
            ResultSet rs = st.executeQuery("select * from student");
            return rs;
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }
}
