
import java.sql.*;


public class DBConnect {
    
    private Connection con;
    private Statement st;
    private ResultSet rs;
    
    
    public DBConnect(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            
        }catch(Exception ex)
        {
            System.out.println("Error: "+ex);
        }
    }
}
