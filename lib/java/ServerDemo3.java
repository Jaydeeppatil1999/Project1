import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class ServerDemo3 extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException
	{
		PrintWriter out=response.getWriter();
		String s1=request.getParameter("un");
		
		out.println("<html>");
		out.println("<body>");
		out.println("<p>welcome"+s1+"</p>");
		out.println("</body>");
		out.println("</html>");
		out.close();
	}
}