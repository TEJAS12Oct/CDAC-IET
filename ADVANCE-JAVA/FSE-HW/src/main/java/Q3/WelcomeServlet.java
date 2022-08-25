package Q3;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class WelcomeServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String Fname = request.getParameter("Fname");
		String Sname = request.getParameter("Sname");
		String gender = request.getParameter("gender");

		PrintWriter pw = response.getWriter();
		response.setContentType("text/html");

		pw.println("<html><body>");
		if (gender.equals("Male")) {
			pw.println("<h1>Mr. " + Fname + " " + Sname + "</h1>;");
		} else {
			pw.println("<h1>Miss. " + Fname + " " + Sname + "</h1>;");
		}

		pw.println("</body></html>");

		pw.close();
	}

}
