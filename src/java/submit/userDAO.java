package submit;

//import java.text.*;
//import java.util.*;
import java.sql.Connection;
//import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
//import java.sql.PreparedStatement;
//import java.sql.JDBCType;


/**
 * 
 * @author boazmac 
 */
public class userDAO {
   
    
    
        public static userBean signin (userBean bean) throws ClassNotFoundException{
       
         Connection currentCon = null;
         ResultSet rs = null;            
         Statement stmt = null;
        // Object preparedStatement = null;
         String email = bean.getemail();
         String password = bean.getpassword();
         Class.forName("oracle.jdbc.driver.OracleDriver");
            
            
            String sql = "select * from sd_careers.members where email'" +email+ "'AND password= '" + password +"'";
            
            
          try{ 
              
              currentCon = ConnectionManager.getConnection();
              stmt = currentCon.createStatement();
              rs = (ResultSet)stmt.executeQuery(sql);
              boolean more = rs.next();
          
          
          
              if(!more)
              {
                  System.out.println("Sorry, you are not a registered user kindly Sign Up first");
                  bean.setValid(false);
              }
              else if(more)
                      {
                          bean.setemail(email);
                          bean.setpassword(password);
                          bean.isValid(true);
                      }
                          
                      }
          catch (SQLException e)
          {
                                         
          }  
              
          finally{
               if(rs!=null){
                     try{
                         rs.close();
                     }
                     catch(Exception e){}
                     rs=null;   
                 
          }
               if (stmt!=null){
                   try{
                       stmt.close();
                       }
                   catch(Exception e){}
                   stmt=null;
               }
                if (currentCon!=null){
                try{
                    currentCon.close();
                    }
                catch(Exception e){}
                    currentCon=null;
                }
                }   
            return bean;
         
              
        }      
     
}          
          
    
    

        