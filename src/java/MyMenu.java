import javax.servlet.http.*;
import javax.servlet.*;
import java.sql.*;
import java.io.*;

public class MyMenu extends HttpServlet 
{
    public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException 
    {
        PrintWriter out = response.getWriter();
        // Cookie[] ck=request.getCookies();
        HttpSession session=request.getSession();
        String s1=(String)session.getAttribute("un");     
        if(s1!=null)
        {
            out.println("<html>");
            out.println("<head><link rel='stylesheet' type='text/css' href='ddd.css'/></head>");
            out.println("<body id='body'>");
            out.println("<div id='mymenu'>");
            out.println("<ul>");
            out.println("<li><a href='index.html'>Home</a></li>");
            out.println("<li><a href='i1'>Insert</a></li>");
            out.println("<li><a href='showall.html'>ShowAll</a></li>");
            out.println("<li><a href='search.html'>Search</a></li>");
            out.println("<li><a href='delete'>Delete</a></li>");
            out.println("<li><a href='LogOut'>Logout</a></li>");
            out.println("</ul>");
            out.println("</div>");
            out.println("welcome "+s1);
       
            out.println("</body>");
            out.println("</html>");
        }
        else
        {
            // out.println("bhaiya y galat h plz login first");
            response.sendRedirect("Login.html");
        }
        out.close();    
    }
}
