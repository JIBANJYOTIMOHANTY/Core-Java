package services;
import java.sql.*;

public class Student_Information {
    public static boolean Stud_send(String name,String roll,String cls)
    {
        try
        {
            Connection cn = repository.ConnectionDB.connectionGet();
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("select roll from student");
            if(rs.next())
            {
                if(rs.getString(1).equals(roll))
                {
                    return false;
                }
            }
            st.executeUpdate("insert into student values('"+name+"','"+roll+"','"+cls+"')");
            return true;
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return false;
    }
}
