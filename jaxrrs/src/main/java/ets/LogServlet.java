package ets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.WebServiceRef;

@WebServlet(urlPatterns = "/log")
public class LogServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@WebServiceRef
	LogLog l;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		PrintWriter writer = response.getWriter();
		writer.write("<html><head></head><body>");
		String logString = request.getParameter("log");
		l.log(logString);
		writer.write("<h1>" + logString);
		writer.write("</h1>");
		writer.write("</body></html>");
	}
}