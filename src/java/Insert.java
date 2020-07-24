import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Insert extends HttpServlet 
{
    public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException
    {
        PrintWriter out = response.getWriter();
        String s1=request.getParameter("a1");
        String s2=request.getParameter("a2");
        String s3=request.getParameter("a3");
        String s4=request.getParameter("a4");
        String s5=request.getParameter("a5");
        out.println("<html>");
        out.println("<body>");
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project1?useSSL=true","root","root");
            Statement st=con.createStatement();
            String q="insert into ins values('"+s1+"','"+s2+"','"+s3+"','"+s4+"','"+s5+"')";
            st.executeUpdate(q);
        
            response.sendRedirect("showall.html");
            con.close();
        }
        catch(Exception e)
        {
            out.println(e);
        }
        out.println("<html>");
        out.println("<body>");
        out.close();
    }
}
