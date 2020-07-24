import javax.servlet.http.*;
import javax.servlet.*;
import java.sql.*;
import java.io.*;
public class i1 extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException 
    {
        PrintWriter out = response.getWriter();
        // Cookie[] ck=request.getCookies();
//        HttpSession session=request.getSession();
//        session.setAttribute("un");
       
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
    
        out.println("<form action='Insert'>");
        out.println("<center>");
        out.println("<table id='table'>");
            
        out.println("<tr>");
        out.println("<td>Roll No.</td>");
        out.println("<td><input type='text' id='t' placeholder='Roll No.' name='a1'></td>");
        out.println("</tr>");
                        
        out.println("<tr>");
        out.println("<td>Name</td>");
        out.println("<td><input type='text' id='t' placeholder='Name' name='a2'></td>");
        out.println("</tr>");
                        
        out.println("<tr>");
        out.println("<td>Physics</td>");
        out.println("<td><input type='text' id='t' placeholder='Physics' name='a3'></td>");
        out.println("</tr>");
                        
        out.println("<tr>");
        out.println("<td>Chemistry</td>");
        out.println("<td><input type='text' id='t' placeholder='Chemistry' name='a4'></td>");
        out.println("</tr>");
                        
        out.println("<tr>");
        out.println("<td>Maths</td>");
        out.println("<td><input type='text' id='t' placeholder='Maths' name='a5'></td>");
        out.println("</tr>");
                        
        out.println("<tr>");
        out.println("<th colspan='2'><input type='submit' id='b' value='Insert'></th>");
        out.println("</tr>");
       
                  
        out.println("</table>");
        out.println("</center>");
        out.println("</form>");
        
        out.println("</body>");
        out.println("</html>");
        out.close();
    }
}