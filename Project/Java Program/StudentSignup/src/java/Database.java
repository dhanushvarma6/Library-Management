
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rahul K N
 */
public class Database {
    Connection con;
    public Connection getCon()
    {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            DriverManger.getConnection("jdbc:mysql://localhost:3306/studentsignup ","root","root");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
       return con; 
    }
    
    
}
