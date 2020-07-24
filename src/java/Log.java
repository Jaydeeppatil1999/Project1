//import javax.servlet.http.*;
//import javax.servlet.*;
//import java.sql.*;
//import java.io.*;
//
//public class Log extends HttpServlet {
//
//    public void doGet(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        
// PrintWriter out = response.getWriter();
//// Cookie[] ck=request.getCookies();
//  HttpSession session=request.getSession();
//  session.setAttribute("jay","deep");
////String s1=(String)session.getAttribute("un");     
//      
//
//       out.println("<html>");
//       out.println("<head><link rel='stylesheet' type='text/css' href='ddd.css'/></head>");
//       out.println("<body id='body'>");
//       out.println("<div id='mymenu'>");
//       out.println("<ul>");
//                out.println("<li><a href='index.html'>Home</a></li>");
//                out.println("<li><a href='Registration.html'>Registration</a></li>");
//                out.println("<li><a href='Log'>Login</a></li>");
//       out.println("</ul>");
//       out.println("</div>");
//       
//       
//      
//       out.println("<form action='login'>");
//        out.println("<center>");
//            out.println("<table id='table'>");
//            
//            out.println("<tr>");
//            out.println("<td>Username</td>");
//            out.println("<td><input type='text' id='t' name='j1'></td>");
//            out.println("</tr>");
//            
//            out.println("<tr>");
//            out.println("<td>Password</td>");
//            out.println("<td><input type='text' id='t' name='j2'></td>");
//            out.println("</tr>");
//            
//            out.println("<tr>");
//            out.println("<th><input type='submit' id='b1' value='Login'></th>");
//            out.println("</tr>");
//            
//       out.println("</table>");
//       out.println("</center>");
//       out.println("</form>");
//       
//        out.println("</body>");
//       out.println("</html>");
//      
//       out.close();
//    
//    }
//}
