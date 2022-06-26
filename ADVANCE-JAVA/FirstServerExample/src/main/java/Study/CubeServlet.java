package Study;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CubeServlet")
public class CubeServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();

		pw.println("<html><body>");
		pw.println("<form method='GET' >");

		pw.println("Enter No : <input type='number' name  ='num' />");

		pw.println("<br/> <input type='Submit' value  ='show Cube' />");

		String num = request.getParameter("num");
		if(num!=null) {
			int n = Integer.parseInt(num);
			int cube =n*n*n;
			pw.println("<br/><br/><br/><br/><h1>The cube of  "+n+" is"+cube+"</h1>");
		}
		
		pw.println("</form></body></html>");
		pw.close();

	}

}
