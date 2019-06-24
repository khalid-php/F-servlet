import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class HttpDemo extends HttpServlet {
	public void service(ServletRequest request,ServletResponse response)throws IOException {
		String name=request.getParameter("sname");
		String qulification=request.getParameter("squalification");
		String contact=request.getParameter("scontact");
		PrintWriter out=response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<h2 color=red>Welcome to "+name+" in Rajgir </h2>");
		out.println("<h3 color=blue> Your Qualification "+qulification+"</h3>");
		out.println("<h4 color=pink>Your Contact is "+contact+"</h4>");
		out.println("</body>");
		out.println("</html>");
	}
}