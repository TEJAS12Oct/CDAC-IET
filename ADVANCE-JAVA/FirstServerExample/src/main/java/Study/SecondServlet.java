package Study;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SecondServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*String num = request.getParameter("num");
		int n = Integer.parseInt(num);
		
		String range = request.getParameter("range");
		int nr = Integer.parseInt(range);
	*/
		
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		
		pw.println("<html><body>");
		for (int i=1;i<=10;i++) 
		{
			String s = 2+"*"+i+"="+2*i;
			System.out.println(s);
//			pw.println("<br />"+s);
			
		}
//		pw.println("</body></html>");
	}


	}

