package submit;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * 
 * @author boazmac 
 */
public class ConnectionManager {
    
    static Connection con;
    static String url;
            
    public static Connection getConnection(){ 
        
    try{
        String host ="jdbc:oracle:thin:@localhost:1521:XE";
        String uName = "sd_careers";
        String uPass = "admin";
        Class.forName("oracle.jdbc.driver.OracleDriver");
    }      
            
     catch(Exception ex)
             {
       // ex.PrintStackTrace();     
    
             
             }       
            
    try{        
       con =  DriverManager.getConnection( "host", "uName", "uPass");
}
    catch(Exception e){
        
        System.out.println("e");
        
    }
        return con;
    }
}



