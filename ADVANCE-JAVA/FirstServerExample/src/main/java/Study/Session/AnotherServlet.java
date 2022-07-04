package Study.Session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class AnotherServlet
 */
@WebServlet("/AnotherServlet")
public class AnotherServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession Session = request.getSession(false);
		if (Session== null) {
			response.getWriter().append("Can Not Acces Without Login");
	return;
		} else {
			response.setContentType("text/html");
			PrintWriter pw = response.getWriter();
			
			String School = request.getParameter("School");
			Session.setAttribute("School", School);
			
			pw.println("<html><body>");
			pw.println("<a href='LogOutServlet'>logout</a>");
			pw.println("<form action='YetAnotherServlet' method='POST'>");
			pw.println("<br/>Welocme " + Session.getAttribute("uname"));
			pw.println("<br/><input type='submit'  value='YetAnotherPage' />");
			pw.println("</form></body></html>");

			pw.close();

		}
	}
}

// First Run LoginServlet