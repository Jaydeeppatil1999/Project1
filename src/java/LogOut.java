import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
public class LogOut extends HttpServlet 
{
    public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException 
    {        
        //Cookie ck=new Cookie("un","");
        //ck.setMaxAge(0);
        //response.addCookie(ck);
        HttpSession session=request.getSession();
        session.invalidate();
        response.sendRedirect("Login.html");                  
    }
}
