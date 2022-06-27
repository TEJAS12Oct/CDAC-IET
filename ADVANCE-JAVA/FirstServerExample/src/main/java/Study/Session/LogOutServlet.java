package Study.Session;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/LogOutServlet")
public class LogOutServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession(false);
		if (session == null) {
			response.getWriter().append("Illegal Logout");

		} else {
			Enumeration<String> Enumeration = session.getAttributeNames();
			while (Enumeration.hasMoreElements()) {
				String attr = Enumeration.nextElement();
				session.removeAttribute(attr);
			}

			session.invalidate();
			response.sendRedirect("LoginServlet");
		}
	}
}
