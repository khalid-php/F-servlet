import javax.servlet.*;
import java.io.*;
	public class GenericDemo extends GenericServlet {
	public void service(ServletRequest request,ServletResponse response) throws IOException {
		PrintWriter out=response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<h1><marquee>Welcome to the Servlet Generic</marquee></h1>");
		out.println("<ol>");
		out.println("<li>");
		out.println("<marquee>there are many method of the GenericServlet class</marquee>");
		out.println("</li>");
		out.println("<li>");
		out.println("<marquee>there are many method of the GenericServlet class</marquee>");
		out.println("</li>");
		out.println("<li>");
		out.println("<marquee>there are many method of the GenericServlet class</marquee>");
		out.println("</li>");
		out.println("<li>");
		out.println("<marquee>there are many method of the GenericServlet class</marquee>");
		out.println("</li>");
		out.println("</ol>");
		out.println("</body>");
		out.println("</html>");
	}
}