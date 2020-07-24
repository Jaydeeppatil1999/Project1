import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class Server1 extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException
	{
		PrintWriter out=response.getWriter();
		String s1=request.getParameter("un");
		String s2=request.getParameter("up");
		
		out.println("<html>");
		out.println("<body>");
		out.println("<p>name="+s1+"</p>");
		out.println("<p>pass="+s2+"</p>");
		out.println("</body>");
		out.println("</html>");
		out.close(); 
	}
}