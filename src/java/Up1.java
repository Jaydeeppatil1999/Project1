import javax.servlet.http.*;
import javax.servlet.*;
import java.sql.*;
import java.io.*;
public class Up1 extends HttpServlet 
{
    public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException 
    {
        PrintWriter out = response.getWriter();
        String s1=request.getParameter("vv");
    
            out.println("<html>");
            out.println("<head><link rel='stylesheet' type='text/css' href='ddd.css'/></head>");
            out.println("<body>");
            try
            {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project1?useSSL=false","root","root");
                Statement st=con.createStatement();
                String q="Select * from ins where uroll='"+s1+"'";
                ResultSet rs=st.executeQuery(q);
                if(rs.next())
                {
                    out.println("<form action='Up2'>");
                    out.print("<center>");
                    out.println("<table id='table' cellpadding='10'>");
                
                    out.println("<tr>");
                    out.println("<td>Roll No.</td>");
                    out.println("<td><input type='text' name='b1' value='"+rs.getString(1)+"'></td>");
                    out.println("</tr>");
                
                    out.println("<tr>");
                    out.println("<td>Name</td>");
                    out.println("<td><input type='text' name='b2' value='"+rs.getString(2)+"'></td>");
                    out.println("</tr>");
                
                    out.println("<tr>");
                    out.println("<td>Physics</td>");
                    out.println("<td><input type='text' name='b3' value='"+rs.getString(3)+"'></td>");
                    out.println("</tr>");
                
                    out.println("<td>");
                    out.println("<td>Chemistry</td>");
                    out.println("<td><input type='text' name='b4' value='"+rs.getString(4)+"'></td>");
                    out.println("</td>");
                
                    out.println("<tr>");
                    out.println("<td>Maths</td>");
                    out.println("<td><input type='text' name='b5' value='"+rs.getString(5)+"'></td>");
                    out.println("</tr>");
                
                    out.println("<tr>");
                    out.println("<td><input type='submit' id='b1' value='Update'></td>");
                    out.println("</tr>");
                
                 
                    out.println("</table>");
                    out.print("</center>");
                    out.println("</form>");
            }
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
