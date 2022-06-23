
 
package project;
import com.mysql.jdbc.*;
import java.sql.Connection;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Driver;


/**
 *
 * @author sourabh
 */
public class ConnectionProvider {
    public static Connection getCon()
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/vpms","root","root");
                    return con;
        }
        catch(Exception e)
        {
            System.out.println(e);
            return null;
        }
    }
    
}
