/** the program is the use of the message display in the browser   */

import javax.servlet.*;
import java.io.*;
public class MessageServlet57 implements Servlet {
	ServletConfig config;
	public void init(ServletConfig config) {
		this.config=config;
	}
	public void service(ServletRequest request,ServletResponse response) throws IOException {
		PrintWriter out=response.getWriter();
		out.println("welcome the servlet programming ");
		out.println("hy folks");
		out.println("a+b=c");
	}
	public void destroy() {
		
	}
	public ServletConfig getServletConfig() {
		return config;
	}
	public String getServletInfo() {
		return "theis is to display a message to the user on the browser";
	}
}
