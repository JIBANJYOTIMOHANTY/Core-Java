import com.mysql.cj.jdbc.MysqlConnectionPoolDataSource;
import java.sql.*;
import javax.sql.*;
public class Demo1 {
    public static void main(String[] args) {
        Connection cn = null;
        Statement st = null;
        try
        {
            MysqlConnectionPoolDataSource ds = new MysqlConnectionPoolDataSource();
            
            ds.setServerName("localhost");
            ds.setPort(3306);
            ds.setUser("root");
            ds.setPassword("Jiban@123");
            ds.setDatabaseName("jt");
            PooledConnection con = ds.getPooledConnection();
            cn = con.getConnection();
            st = cn.createStatement();
            ResultSet rs = st.executeQuery("select * from jt_data2");
            while(rs.next())
            {
                int r = rs.getInt(1);
                String s = rs.getString(2);
                System.out.println("Id is : " + r + "\tName is : " + s);
            }
             
       }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            try{
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
