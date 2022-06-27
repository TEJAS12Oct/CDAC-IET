package Study;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/CounterServlet")
public class CounterServlet extends HttpServlet {

	int counter = 0;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

//		int counter = 0;

		HttpSession Session = request.getSession();
		int ucounter = 0;

		if (Session.isNew()) {

			ucounter = 1;
			Session.setAttribute("userwise_counter", 1);

		} else {
			ucounter = (Integer) Session.getAttribute("userwise_counter");
			ucounter++;
			Session.setAttribute("userwise_counter", ucounter);
		}

		PrintWriter PW = response.getWriter();
		counter++;
		PW.println("Total Hit Count is " + counter);
		PW.println("Total User Wise  Count is " + ucounter);
		PW.close();

	}

}
