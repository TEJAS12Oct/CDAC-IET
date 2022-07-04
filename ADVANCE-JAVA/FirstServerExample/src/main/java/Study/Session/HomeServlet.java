package Study.Session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/HomeServlet")
public class HomeServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession Session = request.getSession(false);
		if (Session != null && Session.getAttribute("uname") == null) {
			response.getWriter().append("Cannot Acces Without Login");
			return;
		} else {
			response.setContentType("text/html");
			PrintWriter pw = response.getWriter();
			pw.println("<html><body>");
			pw.println("<form action='AnotherServlet' method='POST'>");
			pw.println("<br/>Welocme " + Session.getAttribute("uname"));

			pw.println("<br/><b>Schoolname : <b/><input type='text' name='School' />");

			pw.println("<br/><br/><input type='submit'  value='AnotherPage' />");
			pw.println("<a herf='LogOutServlet'>Logout<a/>");
			pw.println("</form></body></html>");

			pw.close();
		}

	}
}

//First Run LoginServlet