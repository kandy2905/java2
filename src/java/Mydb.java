
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
 * @author Administrator
 */
public class Mydb {
    Connection con;
    public Connection getCon()
    {
        try {      
            Class.forName("com.mysql.jdbc.Driver");
            DriverManager.getConnection("jdbc:mysql://localhost:3306/newmydb","root","root");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Mydb.class.getName()).log(Level.SEVERE, null, ex);
        }
            
           
     
    return con;
    }
    }
