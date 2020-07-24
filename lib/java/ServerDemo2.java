import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class ServerDemo2 extends HttpServlet
{
	public void doGet(HttpServletRequest request, HttpServletResponse response)throws IOException,ServletException
	{
		PrintWriter out=response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<p>Softwaves</p>");
		out.println("</body>");
		out.println("</html>");
		
		out.close();
	}
}