package Study.Session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();

		pw.println("<html><body>");
		pw.println("<form  method='POST'>");
		pw.println("<center><h1>LOGIN PAGE</h1>");
		pw.println("<br/><b>Username : <b/><input type='text' name='uname' />");
		pw.println("<br/><br/><b>Password : </b><input type='password' name='pwd' />");
		pw.println("<br/><br/><input type='submit'  value='Login' />");
		pw.println("</form></center></body></html>");

		pw.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String uname = request.getParameter("uname");
		String pwd = request.getParameter("password");

		HttpSession Session = request.getSession();
		if (Session.isNew()) {
			Session.setAttribute("uname", uname);
			RequestDispatcher RD = super.getServletContext().getRequestDispatcher("/HomeServlet");
			RD.forward(request, response);
		}
	}
}
