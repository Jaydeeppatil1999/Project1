import javax.servlet.http.*;
import java.io.*;
import java.sql.*;
import javax.servlet.*;
public class Search extends HttpServlet
{
    public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException
    {
        PrintWriter out = response.getWriter();    
        String s1=request.getParameter("jj");
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
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project1?useSSL=false","root","root");
            Statement st=con.createStatement();
            String q="Select * from ins where uroll='"+s1+"'";
            ResultSet rs=st.executeQuery(q);    
            out.println("<center>");
            out.println("<table cellpadding='10' id='table'>");
           
            out.println("<tr>");
            out.println("<td>Roll No.</td>");
            out.println("<td>Name</td>");
            out.println("<td>Physics</td>");
            out.println("<td>Chemistry</td>");
            out.println("<td>Maths</td>");
            out.println("</tr>");
           
            while(rs.next())
            {
                out.println("<tr>");
                out.println("<td>"+rs.getString(1)+"</td>");
                out.println("<td>"+rs.getString(2)+"</td>");
                out.println("<td>"+rs.getString(3)+"</td>");
                out.println("<td>"+rs.getString(4)+"</td>");
                out.println("<td>"+rs.getString(5)+"</td>");
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
