package Q2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class InputServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();

		pw.println("<html><body>");
		pw.println("<form action='Second' method='post' >");
		pw.println("Username: <input type='uname' name='uname' /><br/>"); // iet
		pw.println("Password: <input type='pass' name='pass' /><br/><br/>"); //123
		pw.println("<br /> <input type='submit' value='submit' />");
		pw.println("</form>");
		pw.println("</body></html>");
		pw.close();
	}

}
//check Web.xml
//Check WEB-INF Using War file Run InputServlet
//http:localhost:8080/App1/First