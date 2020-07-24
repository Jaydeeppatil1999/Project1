import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.sql.*;
public class Regis extends HttpServlet
{
  public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        PrintWriter out=response.getWriter();
        String s1=request.getParameter("v1");
        String s2=request.getParameter("v2");
        String s3=request.getParameter("v3");
        String s4=request.getParameter("v4");
        String s5=request.getParameter("v5");
        
        out.println("<html>");
        out.println("<body>");  
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project1?allowPublicKeyRetrieval=true&useSSL=false","root","root");
            Statement st=con.createStatement();
            String q="insert into regis values('"+s1+"','"+s2+"','"+s3+"','"+s4+"','"+s5+"')";
            st.executeUpdate(q);
            response.sendRedirect("Login.html");
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
