package Study;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Serv2
 */
@WebServlet("/Serv2")
public class Serv2 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String c1 = request.getParameter("count");

		int c = (Integer) request.getAttribute("Counter");

		response.getWriter().append(" Servlet 2 got the Counter AS : " + c)
				.append(" , Servlet 2 got the Counter AS : " + c1);

		ServletContext sc = super.getServletContext();

//		RequestDispatcher rd = sc.getRequestDispatcher("/Serv3");
//		c++;
//		request.setAttribute("counter", c);
////		rd.include(request, response);
//		rd.forward(request, response);
//		
		response.getWriter().append(" Returnning from serv2");

	}

}
// for  serv2 run comment 31  to 36
// Flow ==>   serv1=>serv2=>serv3
// for serv3 run uncomment 31 to 36
