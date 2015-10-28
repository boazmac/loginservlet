
package submit;

//import java.beans.*;
import java.io.Serializable;

/**
 *
 * @author boazmac
 */
public class userBean implements Serializable {
    
    private String firstname;
    private String lastname;
    private String email;
    private String password;
    private String password2;
    private int id;
    public boolean isValid(){
    return
            (firstname !=null )&& 
            (lastname != null) &&
            (email != null)&&
            (password !=null) &&
            (password2 !=null);
    
    }
    
   
  
    public userBean() {
        
    }
    
  
    public String getfirstname(){
        return firstname;
        }
    public void setfirstname(String firstname){
        this.firstname = firstname;
        }
    
    
    public String getlastname(){ 
        return lastname;
    }
    public void setlastname(String lastname){
        this.lastname = lastname;
        }
       
    public String getemail(){
        return email;
    }
    public void setemail (String email){
        this.email=email;
    }
    
    public String getpassword(){
        return password;
        }
    public void setpassword(String password){
        this.password = password;
        }
            
    public String getpassword2(){
        return password2;
        }
    public void setpassword2(String password2){
         this.password2 = password2;
    }

    public boolean isValid(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setValid(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
  
}


 // this is how i had declared them innitially

 /*public String getpassword(){
        return password;
        }
        public void setpassword(String value){     
        String pass = password;
        password = value;
        }

//but this is how they should be declared

    public String getpassword(){
        return password;
        }
    public void setpassword(String password){
        this.password = password;
        }
*/