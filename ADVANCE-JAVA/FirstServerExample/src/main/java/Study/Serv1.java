package Study;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Serv1")
public class Serv1 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int count = Integer.parseInt(request.getParameter("count"));
//		count++;
		response.getWriter().append(" Serv1 Count : " + count++);

		ServletContext context = super.getServletContext();
		RequestDispatcher RD = context.getRequestDispatcher("/Serv2");
		request.setAttribute("Counter", count);
//		RD.include(request, response);
		RD.forward(request, response);
		response.getWriter().append(" Returnning from serv1");

	}

}

// http://localhost:8080/App1/Serv1?count=30