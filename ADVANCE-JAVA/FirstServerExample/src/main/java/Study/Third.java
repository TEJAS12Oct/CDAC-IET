package Study;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Third extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		
		pw.println("<html><body>");
		for (int i=1;i<=10;i++) 
		{
			String s = 2+"*"+i+"="+2*i;
			System.out.println(s);
			
		}
		pw.println("</body></html>");
		pw.close();
	}

}
// check web.xml
// http://localhost:8080/App1/Third