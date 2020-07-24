import javax.servlet.http.*;
import java.io.*;
import java.sql.*;
import javax.servlet.*;
public class Delete extends HttpServlet 
{
    public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException 
    {
        PrintWriter out = response.getWriter();
        String s1=request.getParameter("pp");
        out.println("<html>");
        out.println("<body>");
        
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project1?useSSL=false","root","root");
            Statement st=con.createStatement();
            String q="delete from ins where uroll='"+s1+"'";
            st.executeUpdate(q);
            response.sendRedirect("showall.html");
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
