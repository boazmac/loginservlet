package submit;

import java.sql.Connection;
//import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * 
 * @author boazmac 
 */
public class userInDAO {

    /**
     *
     * @param bean
     * @return
     */
    public static userBean signup (userBean bean){
        
        try{
            
            Connection currentCon = null;
            ResultSet rs = null;
            Statement stmt = null;
            String firstname = bean.getfirstname();
            String lastname = bean.getlastname();
            String email =bean.getemail();
            String password=bean.getpassword();
            String password2=bean.getpassword2();
            Class.forName("oracle.jdbc.driver.OracleDriver");
            
            String sql = "insert into sd_careers.members (firstname,lastname,email,password,password2) values (?,?,?,?,?)";
            try{
                currentCon = ConnectionManager.getConnection(); 
                stmt = currentCon.createStatement();
                rs = (ResultSet)stmt.executeQuery(sql);
                boolean more = rs.next();
                if(!more)
                {
                    System.out.println("Sorry, kindly input correct credentials");
                    bean.setValid(false);
                }
                else if(more)
                {
                    bean.setfirstname(firstname);
                    bean.setlastname(lastname);
                    bean.setemail(email);
                    bean.setpassword(password);
                    bean.setpassword2(password2);
                    bean.isValid(true);
                    bean.setValid(more);
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
          catch (ClassNotFoundException ex)
          {
            Logger.getLogger(userInDAO.class.getName()).log(Level.SEVERE, null, ex);
                                         
          }   
        return null;
         
        
    }
}

     
        
          
        
        
        


