import java.util.*;
import java.sql.*;

public class Function3 {
    public static void main(String[] args) {
        Scanner ss = new Scanner((System.in));
        System.out.println("Enter the regdno : ");
        Connection cn = null;
        CallableStatement cs = null;
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://localhost:3306:/jt","root","Jiban@123");
            String query = "{? = call jt_function3(?,?,?)}";
            cs = cn.prepareCall(query);
            cs.setInt(2,num);
            cs.registerOutParameter(1,Types.INTEGER);
            cs.registerOutParameter(3,Types.VARCHAR);
            cs.registerOutParameter(4,Types.VARCHAR);
            CS.execute();
            System.out.println("Name is ");
        }
    }    
}
