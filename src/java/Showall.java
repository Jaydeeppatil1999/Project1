import javax.servlet.http.*;
import javax.servlet.*;
import java.sql.*;
import java.io.*;

public class Showall extends HttpServlet 
{
    public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException
    {
        PrintWriter out = response.getWriter();
       
        out.println("<html>");
        out.println("<head><link rel='stylesheet' type='text/css' href='ddd.css'/></head>");
        out.println("<body id='body'>");
        out.println("<div id='mymenu'>");
        out.println("<ul>");
        out.println("<li><a href='index.html'>Home</a></li>");
        out.println("<li><a href='showall.html'>ShowAll</a></li>");
        out.println("<li><a href='search.html'>Search</a></li>");
        out.println("<li><a href='delete.html'>Delete</a></li>");
        out.println("</ul>");
        out.println("</div>");
       
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project1?useSSL=false","root","root");
            Statement st=con.createStatement();
            String q="Select * from ins";
            ResultSet rs=st.executeQuery(q);
            out.println("<center>");
            out.println("<table cellpadding='7' id='table'>");
           
            out.println("<tr>");
            out.println("<th>Roll no.&nbsp</th>");
            out.println("<th>Name &nbsp</th>");
            out.println("<th>Physics</th>");
            out.println("<th>Chemitry</th>");
            out.println("<th>Maths</th>");
            out.println("</tr>");
           
            while(rs.next())
            {
               
                out.println("<tr>");
                out.println("<td>"+rs.getString(1)+"</td>");
                out.println("<td>"+rs.getString(2)+"</td>");
                out.println("<td>"+rs.getString(3)+"</td>");
                out.println("<td>"+rs.getString(4)+"</td>");
                out.println("<td>"+rs.getString(4)+"</td>");
                out.println("</tr>");
               
            }    
            out.println("</table>");
            out.println("</center>");
            con.close();
        }
        catch(Exception e)
        {
            out.println(e);
        }
        out.println("</body>");
        out.println("</html>");
        out.close();
    }
}
