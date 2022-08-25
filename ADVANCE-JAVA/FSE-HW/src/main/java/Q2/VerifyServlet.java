package Q2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class VerifyServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String uname = request.getParameter("uname");

		String pass = request.getParameter("pass");

		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();

		pw.println("<html><body><center>");
		if (uname.equals("iet") && pass.equals("123")) {
			pw.println("<h1>Login Success</h1>");
		} else {
			pw.println("<h1>Login Failed</h1>");
		}
		pw.println("</body></html>");
	}

}
