package submit;

import java.io.IOException;
//import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author boazmac
 */
@WebServlet(name = "signin", urlPatterns = {"/signin"})
public class signin extends HttpServlet {

   
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
                 user.setemail(request.getParameter("email"));
                 user.setpassword(request.getParameter("password"));
                 
                 user = userDAO.signin(user);
                         if (user.isValid())
                         {
                             HttpSession session =request.getSession(true);
                             session.setAttribute("CurrentSessionUser", user);
                             response.sendRedirect("signin.jsp");// make a logged user page                  
                             
                         }
                         else
                         
                         response.sendRedirect("signup.jsp");// create am invalid user page
                         
                         
                    
                }
                catch(Exception e )
                {System.out.println("e");
                
                }
             
             
            }
       
    
}
    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
   // @Override
   // public String getServletInfo() {
   //   return "Short description";
   // }// </editor-fold>

//}
