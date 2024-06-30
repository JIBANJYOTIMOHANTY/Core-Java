
package service;
import java.sql.*;
import java.io.*;
import java.util.*;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jiban
 */
public class AddService {
    public static boolean Insert(String name, String roll, String address, String phno)
    {
        try
        {
            String roll2 = "";
            Connection cn = repository.ConnectionDB.getConnectionDB();
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("select * from student");
            while(rs.next())
            {
                roll2 = rs.getString(2);
                if(roll.equals(roll2))
                {
                    return false;
                }
                
            }   
            st.executeUpdate("insert into student values('"+name+"','"+roll+"','"+address+"','"+phno+"')");
            return true;
               
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
           
        return false;
    }
}
