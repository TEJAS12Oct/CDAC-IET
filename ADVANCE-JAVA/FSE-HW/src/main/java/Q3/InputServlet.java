package Q3;

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
		pw.println("<center>");
		pw.println("<fieldset><h1>WELCOME</h1>");
		
		pw.println("<form  action='Fifth' method='post'>");
		pw.println("<br/>Enter Name:<input type='text' name='Fname'/>");
		pw.println("<br/><br/>Enter Surname:<input type='text' name='Sname'/>");
		pw.println("<br/>Gender:<br/>Male<input type='radio' name='gender' value='Male'/>");
		pw.println("<br/>Female<input type='radio' name='gender' value='Female'/>");
		pw.println("<br/>Submit:<input type='submit'>;");
		pw.println("</form>");
		pw.println("</fieldset>");
		pw.println("</body><html>");
		pw.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
//http:localhost:8080/App1/Fourth