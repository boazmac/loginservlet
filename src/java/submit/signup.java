package submit;

import java.io.IOException;
//import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.sql.*;


/**
 *
 * @author boazmac
 */
@WebServlet(name = "signup", urlPatterns = {"/signup"})
public class signup extends HttpServlet {

    
   
  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      response.setContentType("text/html;charset=UTF-8");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");       
     
       try{
           userBean user = new userBean();
           user.setfirstname(request.getParameter("firstname"));
           user.setlastname(request.getParameter("lastname"));
           user.setemail(request.getParameter("email"));
           user.setpassword(request.getParameter("password"));
           user.setpassword2(request.getParameter("password2"));
           user = userInDAO.signup(user);
                if(user.isValid())
                {
                    HttpSession session = request.getSession(true);
                    session.setAttribute("CurrenrSessionUser",user);
                    response.sendRedirect("signin.jsp");
                }
                else
                    response.sendRedirect(null);
           
       }
       catch(Exception e){
           
       }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
