import javax.servlet.*;
import java.io.*;
import java.util.Date;

public class DateServlet implements Servlet {
	ServletConfig config;
	public void init(ServletConfig config) {
		this.config=config;
	}
	public void service(ServletRequest request,ServletResponse response)throws IOException {
		PrintWriter out=response.getWriter();
		Date date=new Date();
		out.println("<h1>welcome to Anisul haque </h1>");
		out.println("Today date is "+date);	
	}
	public void destroy() { }
	public ServletConfig getServletConfig() {
		return config;
	}
	public String getServletInfo() {
		return "this servlet is to  display a date";
	}
}
