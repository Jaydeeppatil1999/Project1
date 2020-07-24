import javax.servlet.http.*;
import javax.servlet.*;
import java.sql.*;
import java.io.*;
public class delete1 extends HttpServlet 
{
    public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException 
    {
        
        PrintWriter out = response.getWriter();
        // Cookie[] ck=request.getCookies();
        HttpSession session=request.getSession();
  
      

        out.println("<html>");
        out.println("<head><link rel='stylesheet' type='text/css' href='ddd.css'/></head>");
        out.println("<body id='body'>");
        out.println("<div id='mymenu'>");
        out.println("<ul>");
        out.println("<li><a href='index.html'>Home</a></li>");
        out.println("<li><a href='showall.html'>ShowAll</a></li>");
        out.println("<li><a href='search.html'>Search</a></li>");
        out.println("<li><a href='Log'>Delete</a></li>");
        out.println("<li><a href='LogOut'>Logout</a></li>");
        out.println("</ul>");
        out.println("</div>");    
       
        out.println("<form action='Delete'>");
        out.println("<table id='table'>");
            
        out.println("<tr>");
        out.println("<td>Enter RNO.</td>");
        out.println("<td><input type='text' id='t' name='pp'></td>");
        out.println("</tr>");
            
        out.println("<tr>");
        out.println("<th><input type='submit' id='b1' value='Login'></th>");
        out.println("</tr>");
            
       
        out.println("</body>");
        out.println("</html>");
      
        out.close();
    }
}
