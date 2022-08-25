package Q4;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class StringServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		pw.println("<html><body>");
		pw.println("<table border='1'> ");

		pw.println("<h3><tr><th> Serial-No</th> <th>Folder-Name</th></tr></h3>");

		char ch = 0;
		int A = 1;
		int K = 1;
		for (int i = 1; i < 200; i++) {
			int num = (65 % 65) + 65 + (K - 1);
			ch = (char) num;
			pw.println("<tr><td><center>" + i + "</center></td>" + "<td><center>" + "" + ch + "" + A
					+ "</center></td></tr>");
			if (i == (26 * A)) {
				A++;
				K = 0;
			}
			K++;
		}
		pw.println("</table></body></html>");

	}

}
// http:localhost:8080/App1/Sixth