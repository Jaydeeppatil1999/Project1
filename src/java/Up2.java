import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class Up2 extends HttpServlet 
{
    public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException 
    {
        PrintWriter out = response.getWriter();
        String s1=request.getParameter("b1");
        String s2=request.getParameter("b2");
        String s3=request.getParameter("b3");
        String s4=request.getParameter("b4");
        String s5=request.getParameter("b5");
        
        
        out.println("<html>");
        out.println("<body>");
           
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project1?useSSL=false","root","root");
            Statement st=con.createStatement();
            String q="update ins set uname='"+s2+"', uphy='"+s3+"', uche='"+s4+"', umaths='"+s5+"' where uroll='"+s1+"'";
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
