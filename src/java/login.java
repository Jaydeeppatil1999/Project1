import javax.servlet.http.*;
import javax.servlet.*;
import java.sql.*;
import java.io.*;
public class login extends HttpServlet 
{
    public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException 
    {
       PrintWriter out = response.getWriter();
       String s1=request.getParameter("us");
       String s2=request.getParameter("ps");
      
        out.println("<html>");
        out.println("<body>");
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project1?useSSL=false","root","root");
            Statement st=con.createStatement();
            String q="Select * from regis where Uname='"+s1+"' AND Upass='"+s2+"'";
            ResultSet rs=st.executeQuery(q);
            if(rs.next())
            {
                //Cookie ck=new Cookie("un",s1);
              //  ck.setMaxAge(60*60);
                //response.addCookie(ck);
              
                HttpSession session=request.getSession();
                session.setAttribute("un",s1);           
                
               response.sendRedirect("MyMenu");
            }
            else
            {
                response.sendRedirect("Login.html");
                //out.println("Login.html");
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
